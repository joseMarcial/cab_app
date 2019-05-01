package com.cab.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cab.bean.cabinfo.MgmtCabInfo;
import com.cab.bean.cabinfo.MgmtCabInfoRequestBody;
import com.cab.bean.cabinfo.MgmtCabLocationRequestBody;
import com.cab.bean.cabinfo.OperationResult;
import com.cab.jpa.model.CabInfo;
import com.cab.jpa.model.LocationHistory;
import com.cab.jpa.repository.impl.CabInfoRepositoryImpl;
import com.cab.jpa.repository.impl.LocationHistoryRepositoryImpl;

/**
 * @author jose.marcial
 *
 */
@Component
@Qualifier("CabInfoService")
public class CabInfoService {

	private static final String ERROR_STRING = "ERROR";

	private static final String LOCATION_UPDATE_STRING = "Location Update";

	@Autowired
	CabInfoRepositoryImpl cabInfoRepositoryImpl;

	@Autowired
	LocationHistoryRepositoryImpl locationHistoryRepositoryImpl;

	/**
	 * @param requestBody
	 * @return
	 */
	public MgmtCabInfo createCabInfo(MgmtCabInfoRequestBody requestBody) {

		CabInfo record = new CabInfo();
		record.setPlates(requestBody.getPlates());
		record.setDriverName(requestBody.getDriverName());
		CabInfo savedRecord = cabInfoRepositoryImpl.save(record);
		return new MgmtCabInfo(savedRecord.getId(), savedRecord.getPlates(), savedRecord.getDriverName());

	}

	public OperationResult updateCabLocation(Long cabId, MgmtCabLocationRequestBody locationUpdateRequestBody) {
		OperationResult result = new OperationResult();

		Optional<CabInfo> searchResult = cabInfoRepositoryImpl.findById(cabId);
		if (searchResult.isPresent()) {
			LocationHistory locationSaved = updateLocation(locationUpdateRequestBody);
			if (locationSaved.getId() != null) {
				result.setOperationName(LOCATION_UPDATE_STRING);
				result.setResultDescription("Success");
			} else {
				result.setOperationName(LOCATION_UPDATE_STRING);
				result.setResultDescription(ERROR_STRING);
				createErrorResponse(result, String.format("ERROR WHILE UPDATING LOCATION FOR CABID: %s", cabId));
			}
		} else {
			result.setOperationName(LOCATION_UPDATE_STRING);
			result.setResultDescription(ERROR_STRING);
			createErrorResponse(result, String.format("NO INFO FOUND FOR CABID: %s", cabId));
		}

		return result;

	}

	private void createErrorResponse(OperationResult result, String errorDesc) {
		Map<String, String> errors = new HashMap<>();
		errors.put(ERROR_STRING, errorDesc);
		result.setErrors(errors);
	}

	private LocationHistory updateLocation(MgmtCabLocationRequestBody request) {

		return locationHistoryRepositoryImpl.save(new LocationHistory(request.getCabId(), request.getServiceId(),
				request.getLatitude(), request.getLongitude(), request.getTimeStamp()));

	}

}

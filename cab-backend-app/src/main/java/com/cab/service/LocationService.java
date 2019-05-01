package com.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cab.bean.cabinfo.MgmtLastCabLocationResponse;
import com.cab.jpa.model.LocationHistory;
import com.cab.jpa.repository.impl.LocationHistoryRepositoryImpl;

/**
 * @author jose.marcial
 *
 */
@Component
@Qualifier("LocationService")
public class LocationService {

	@Autowired
	LocationHistoryRepositoryImpl locationHistoryRepositoryImpl;

	/**
	 * @param requestBody
	 * @return
	 */
	public MgmtLastCabLocationResponse getLastCabLocation(Long cabId) {

		MgmtLastCabLocationResponse response = new MgmtLastCabLocationResponse();

		LocationHistory result = locationHistoryRepositoryImpl.findLastCabLocationByCabId(cabId);

		if (result != null) {

			response.setCabId(result.getCabId());
			response.setServiceId(result.getServiceId());
			response.setLatitude(result.getLatitude());
			response.setLongitude(result.getLongitude());
			response.setTimeStamp(result.getTimeStamp());
			response.setResult("SUCCESS");
			response.setResultDesc("SUCCESS");
		} else {
			response.setResult("ERROR");
			response.setResultDesc(String.format("NO INFO FOUND FOR CABID: %s", cabId));
		}
		return response;
	}

}

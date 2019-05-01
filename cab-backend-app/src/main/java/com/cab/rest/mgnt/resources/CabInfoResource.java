package com.cab.rest.mgnt.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cab.bean.cabinfo.MgmtCabInfo;
import com.cab.bean.cabinfo.MgmtCabInfoRequestBody;
import com.cab.bean.cabinfo.MgmtCabLocationRequestBody;
import com.cab.bean.cabinfo.OperationResult;
import com.cab.rest.mgnt.api.ICabInfoAPI;
import com.cab.service.CabInfoService;

@RestController
public class CabInfoResource implements ICabInfoAPI {

	@Autowired
    @Qualifier("CabInfoService")
    private CabInfoService service;	
	
	@Override
	public ResponseEntity<MgmtCabInfo> createCabInfo(MgmtCabInfoRequestBody requestBody) {
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(service.createCabInfo(requestBody));
	}

	@Override
	public ResponseEntity<OperationResult> updateLocation(Long cabId, MgmtCabLocationRequestBody locationUpdateRequestBody) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateCabLocation(cabId, locationUpdateRequestBody));
	}

}

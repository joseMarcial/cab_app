package com.cab.rest.mgnt.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cab.bean.cabinfo.MgmtLastCabLocationResponse;
import com.cab.rest.mgnt.api.ILocationAPI;
import com.cab.service.LocationService;

@RestController
public class LocationResource implements ILocationAPI {

	@Autowired
    @Qualifier("LocationService")
    private LocationService service;

	@Override
	public ResponseEntity<MgmtLastCabLocationResponse> getLastCabLocation(Long cabId) {
		
		return ResponseEntity.ok(service.getLastCabLocation(cabId));
	}	
	
	

}

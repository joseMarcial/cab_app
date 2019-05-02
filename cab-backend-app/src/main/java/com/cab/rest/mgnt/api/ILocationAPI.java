package com.cab.rest.mgnt.api;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cab.bean.cabinfo.MgmtLastCabLocationResponse;



/**
 * API  for handling location retrieval operations.
 */
@RequestMapping(MgmtRestConstants.LOCATION_V1_REQUEST_MAPPING)
public interface ILocationAPI {
	
	 /**
     * Handles the GET request of retrieving a single target filter.
     *
     * @param filterId
     *            the ID of the target filter to retrieve
     * @return a single target with status OK.
     */

    @RequestMapping(method = RequestMethod.GET, value = "/{cabId}", produces = { MediaTypes.HAL_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<MgmtLastCabLocationResponse> getLastCabLocation(@PathVariable("cabId") Long filterId);
    
   

}

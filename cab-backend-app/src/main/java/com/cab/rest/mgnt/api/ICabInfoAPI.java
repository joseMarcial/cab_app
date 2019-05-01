package com.cab.rest.mgnt.api;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cab.bean.cabinfo.MgmtCabInfo;
import com.cab.bean.cabinfo.MgmtCabInfoRequestBody;
import com.cab.bean.cabinfo.MgmtCabLocationRequestBody;
import com.cab.bean.cabinfo.OperationResult;



/**
 * API  for handling CabInfo operations.
 */
@RequestMapping(MgmtRestConstants.CAB_INFO_V1_REQUEST_MAPPING)
public interface ICabInfoAPI {
	
	 /**
     * Handles the POST request of creating new cabInfo. The request body 
     * should contain plates and driver name
     * 
     *
     * @param request
     *            the Cab Info to be created.
     * @return In case all filters were successfully created the ResponseEntity
     *         with status code 201 with a created entity
     *         is returned. In any failure the JsonResponseExceptionHandler is
     *         handling the response.
     */
    @RequestMapping(method = RequestMethod.POST, consumes = { MediaTypes.HAL_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE }, produces = { MediaTypes.HAL_JSON_VALUE,
                    MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<MgmtCabInfo> createCabInfo(@RequestBody MgmtCabInfoRequestBody request);
    
    
    
    /**
     * Handles the PUT request of updating a target filter. The ID is within the
     * URL path of the request. A given ID in the request body is ignored. It's
     * not possible to set fields to {@code null} values.
     *
     * @param filterId
     *            the path parameter which contains the ID of the target filter
     * @param filterQueryRequestBody
     *            the request body which contains the fields which should be
     *            updated, fields which are not given are ignored for the
     *            update.
     * @return the updated target filter response which contains all fields
     *         including fields which have not been updated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{cabId}", consumes = { MediaTypes.HAL_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE }, produces = { MediaTypes.HAL_JSON_VALUE,
                    MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<OperationResult> updateLocation(@PathVariable("cabId") Long cabId,
                                                       @RequestBody MgmtCabLocationRequestBody locationUpdateRequestBody);


}

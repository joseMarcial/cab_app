package com.cab.rest.mgnt.api;

/**
 * Constants for RESTful API.
 *
 */
public final  class MgmtRestConstants {
	
	/**
     * The base URL mapping of the SP rest resources.
     */
    public static final String BASE_V1_REQUEST_MAPPING = "/rest/v1";
	
	
	 /**
     * The CabInfo URL mapping rest resource.
     */
    public static final String CAB_INFO_V1_REQUEST_MAPPING = BASE_V1_REQUEST_MAPPING + "/cabinfo";
    /**
     * The CabInfo URL mapping rest resource.
     */
    public static final String LOCATION_V1_REQUEST_MAPPING = BASE_V1_REQUEST_MAPPING + "/location";
    
    
    // constant class, private constructor.
    private MgmtRestConstants() {

    }
}

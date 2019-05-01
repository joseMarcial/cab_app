package com.cab.bean.cabinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for CabLocation PUT/POST commands.
 *
 */
public class MgmtCabLocationRequestBody {
	
	
	
    @JsonProperty(required = true)
    private Long cabId;
    
    private Long ServiceId;
    
    @JsonProperty(required = true)
    private Double latitude;
    
    @JsonProperty(required = true)
    private Double longitude;
    
    private Long timeStamp;

	public Long getCabId() {
		return cabId;
	}

	public void setCabId(Long cabId) {
		this.cabId = cabId;
	}

	public Long getServiceId() {
		return ServiceId;
	}

	public void setServiceId(Long serviceId) {
		ServiceId = serviceId;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

    
   
   

}

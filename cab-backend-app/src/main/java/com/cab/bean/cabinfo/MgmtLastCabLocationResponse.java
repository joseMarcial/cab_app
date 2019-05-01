package com.cab.bean.cabinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MgmtLastCabLocationResponse {
	
		@JsonProperty(value = "cabId", required = true)
	    private Long cabId;

	    @JsonProperty(value = "serviceId", required = true)
	    private Long serviceId;
	    
	    @JsonProperty(required = true)
	    private Double latitude;
	    
	    @JsonProperty(required = true)
	    private Double longitude;
	    
	    @JsonProperty(required = true)
	    private Long timeStamp;
	    
	    @JsonProperty(required = true)
	    private String result;
	    
	    @JsonProperty(required = true)
	    private String resultDesc;
	    		
		


		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getResultDesc() {
			return resultDesc;
		}

		public void setResultDesc(String resultDesc) {
			this.resultDesc = resultDesc;
		}

		public Long getCabId() {
			return cabId;
		}

		public void setCabId(Long cabId) {
			this.cabId = cabId;
		}

		public Long getServiceId() {
			return serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
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

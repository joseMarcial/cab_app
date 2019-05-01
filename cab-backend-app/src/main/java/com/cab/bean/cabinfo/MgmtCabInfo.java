package com.cab.bean.cabinfo;

import com.cab.bean.MgmtBaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A json annotated rest model for CabInfo to RESTful API
 * representation.
 *
 */
@JsonInclude(Include.ALWAYS)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MgmtCabInfo extends MgmtBaseEntity {

    @JsonProperty(value = "cabId", required = true)
    private Long cabId;

    @JsonProperty
    private String plates;

    @JsonProperty
    private String driverName;

	public Long getCabId() {
		return cabId;
	}

	public void setCabId(Long cabId) {
		cabId = cabId;
	}

	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public MgmtCabInfo(Long cabId, String plates, String driverName) {
		super();
		cabId = cabId;
		this.plates = plates;
		this.driverName = driverName;
	}
   

}

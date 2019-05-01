package com.cab.bean.cabinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for target PUT/POST commands.
 *
 */
public class MgmtCabInfoRequestBody {
	
	@JsonProperty
    private Long id ;
	
    @JsonProperty(required = true)
    private String plates;

    @JsonProperty(required = true)
    private String driverName;

    public String getPlates() {
        return plates;
    }

        
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPlates(final String plates) {
        this.plates = plates;
    }
	
	

    public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public String getDriverName() {
        return driverName;
    }
   

}

package com.cab.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "location_History")
public class LocationHistory {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "cab_id", nullable = false)
	private Long cabId;
	
	@Column(name = "service_id", nullable = false)
	private Long serviceId;

	
	@Column(name = "latitude", nullable = false)
	private Double latitude;
	
	@Column(name = "longitude", nullable = false)
	private Double longitude;
	
	@Column(name = "loc_timestamp", nullable = false)	
	private Long locTimeStamp;
	
	LocationHistory(){
		// Default constructor for JPA.
	}
	
	
	
	public LocationHistory(Long cabId, Long serviceId,
			Double latitude,  Double longitude, Long timeStamp) {
		super();
		this.cabId = cabId;
		this.serviceId = serviceId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.locTimeStamp = timeStamp;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
		return locTimeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.locTimeStamp = timeStamp;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LocationHistory{");
		sb.append("id='").append(getId()).append('\'');
		sb.append(", cab_id='").append(cabId).append('\'');
		sb.append(", service_id='").append(serviceId).append('\'');	
		sb.append(", latitude='").append(latitude).append('\'');	
		sb.append(", longitude='").append(longitude).append('\'');	
		sb.append(", timeStamp='").append(locTimeStamp).append('\'');	
		sb.append('}');
		return sb.toString();
	}
}

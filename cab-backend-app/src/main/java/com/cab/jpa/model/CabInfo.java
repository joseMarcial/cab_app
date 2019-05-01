package com.cab.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import javax.validation.constraints.NotEmpty;




@Entity
@Table(name = "cab_info")
public class CabInfo {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "plates", length = JPAValidationRules.OP_NAME_MAX_SIZE, nullable = false)
	@Size(max = JPAValidationRules.OP_NAME_MAX_SIZE)
	@NotEmpty
	private String plates;

	@Column(name = "driver_name", length = JPAValidationRules.DESCRIPTION_MAX_SIZE, nullable = false)
	@Size(max = JPAValidationRules.DESCRIPTION_MAX_SIZE)
	@NotEmpty
	private String driverName;

	

	public CabInfo(String plates, String driverName) {
		this.plates = plates;
		this.driverName = driverName;
		
	}

	public CabInfo() {
		// Default constructor for JPA.
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CabInfo{");
		sb.append("id='").append(getId()).append('\'');
		sb.append(", plates='").append(plates).append('\'');
		sb.append(", driverName='").append(driverName).append('\'');		
		sb.append('}');
		return sb.toString();
	}
}

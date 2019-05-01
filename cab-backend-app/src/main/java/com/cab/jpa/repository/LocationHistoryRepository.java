package com.cab.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.cab.jpa.model.LocationHistory;



public interface LocationHistoryRepository extends CrudRepository<LocationHistory, Long> {
	
		
		LocationHistory findTopByCabIdOrderByLocTimeStampDesc(long cabId);
		
	
	
}

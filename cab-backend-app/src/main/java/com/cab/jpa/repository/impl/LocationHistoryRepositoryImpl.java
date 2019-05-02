package com.cab.jpa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.jpa.model.LocationHistory;
import com.cab.jpa.repository.LocationHistoryRepository;

@Service
public class LocationHistoryRepositoryImpl {

@Autowired
LocationHistoryRepository locationHistoryRepository;


	public LocationHistory save (LocationHistory record) {
		return locationHistoryRepository.save(record);
	}

	public LocationHistory findLastCabLocationByCabId(long cabId) {
		return locationHistoryRepository.findTopByCabIdOrderByLocTimeStampDesc(cabId);
	}
}

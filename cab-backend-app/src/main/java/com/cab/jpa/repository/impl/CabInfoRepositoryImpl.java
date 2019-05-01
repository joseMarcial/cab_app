package com.cab.jpa.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.jpa.model.CabInfo;
import com.cab.jpa.repository.CabInfoRepository;

@Service
public class CabInfoRepositoryImpl {

@Autowired
CabInfoRepository cabInfoRepository;


	public CabInfo save (CabInfo record) {
		return cabInfoRepository.save(record);
	}

	public Optional<CabInfo> findById(Long cabId) {
		
		return cabInfoRepository.findById(cabId);
	}
}

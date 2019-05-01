package com.cab.jpa.repository.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.cab.jpa.model.LocationHistory;
import com.cab.jpa.repository.LocationHistoryRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LocationHistoryRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	LocationHistoryRepository locationHistoryRepository;
	
	
	
	
	@Test
	public void testNoInfoInDB_nullResult() {
		
		LocationHistory result = locationHistoryRepository.findTopByCabIdOrderByLocTimeStampDesc(1L);
		Assert.isNull(result, "null beacuse there is nothing in DB");
	}
	
	public void init() {
		LocationHistory lh = new LocationHistory(1L, 1L, 37.29095, -122.00172, 1556684639414L);
		LocationHistory persistedLh = entityManager.persist(lh);
		entityManager.flush();
	}
	
	@Test
	public void testOneRecordInDB_nullNoMatchingId() {
		init();
		LocationHistory result = locationHistoryRepository.findTopByCabIdOrderByLocTimeStampDesc(5L);
		Assert.isNull(result, "null beacuse there is one record with id != 5");
	}
	
	@Test
	public void testOneRecordInDB_oneMatchingId() {
		init();
		LocationHistory result = locationHistoryRepository.findTopByCabIdOrderByLocTimeStampDesc(1L);
		Assert.isTrue(result != null, "matching record with id =1 as DB was empty previus to init() execution");
	}

}

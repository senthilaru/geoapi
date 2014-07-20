package com.spsa.geoapi.service;

import org.junit.Test;

import com.spsa.geoapi.domain.GeoAddress;

public class GeoApiServiceImplTest {
	
	@Test
	public void testGetAddressByIp(){
		GeoApiServiceImpl service = new GeoApiServiceImpl();
		GeoAddress address = service.getAddressByIp("117.207.204.213");
		System.out.println("address;"+address);
	}
	
}

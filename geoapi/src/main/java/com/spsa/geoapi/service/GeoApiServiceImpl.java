package com.spsa.geoapi.service;

import java.io.IOException;
import java.net.URL;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spsa.geoapi.domain.GeoAddress;

public class GeoApiServiceImpl implements GeoApiService{
	private ObjectMapper geoMapper = new ObjectMapper();
	private String GEO_SOURCE_URL = "http://www.telize.com/geoip/%s";

	public GeoAddress getAddressByIp(String ip) {
		try {
			URL url = new URL(String.format(GEO_SOURCE_URL, ip));
			return geoMapper.readValue(url, GeoAddress.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

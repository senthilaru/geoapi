package com.spsa.geoapi.service;

import com.spsa.geoapi.domain.GeoAddress;

public interface GeoApiService {
	GeoAddress getAddressByIp(String ip);
}

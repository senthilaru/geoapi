package com.spsa.geoapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoAddress {
	@JsonProperty("dma_code") private Integer dmaCode;
	@JsonProperty("region") private String region;
	@JsonProperty("continent_code") private String continentCode;
	@JsonProperty("area_code") private Integer area_code;
	@JsonProperty("isp") private String isp;
	@JsonProperty("country_code") private String countryCode;
	@JsonProperty("country") private String country;
	@JsonProperty("ip") private String ip;
	@JsonProperty("city") private String city;
	@JsonProperty("timezone") private String timezone;
	@JsonProperty("region_code") private Integer regionCode;
	@JsonProperty("country_code3") private String countryCode3;
	@JsonProperty("asn") private String asn;
	@JsonProperty("longitude") private Double longitude;
	@JsonProperty("latitude") private Double latitude;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeoAddress [dmaCode=");
		builder.append(dmaCode);
		builder.append(", region=");
		builder.append(region);
		builder.append(", continentCode=");
		builder.append(continentCode);
		builder.append(", area_code=");
		builder.append(area_code);
		builder.append(", isp=");
		builder.append(isp);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append(", country=");
		builder.append(country);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", city=");
		builder.append(city);
		builder.append(", timezone=");
		builder.append(timezone);
		builder.append(", regionCode=");
		builder.append(regionCode);
		builder.append(", countryCode3=");
		builder.append(countryCode3);
		builder.append(", asn=");
		builder.append(asn);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append("]");
		return builder.toString();
	}
	
	
}

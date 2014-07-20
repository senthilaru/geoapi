package com.spsa.geoapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoAddress {
	@JsonProperty("dma_code") private Integer dma_code;
	@JsonProperty("region") private String region;
	@JsonProperty("continent_code") private String continent_code;
	@JsonProperty("area_code") private Integer area_code;
	@JsonProperty("isp") private String isp;
	@JsonProperty("country_code") private String country_code;
	@JsonProperty("country") private String country;
	@JsonProperty("ip") private String ip;
	@JsonProperty("city") private String city;
	@JsonProperty("timezone") private String timezone;
	@JsonProperty("region_code") private Integer region_code;
	@JsonProperty("country_code3") private String country_code3;
	@JsonProperty("asn") private String asn;
	@JsonProperty("longitude") private Double longitude;
	@JsonProperty("latitude") private Double latitude;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GeoAddress [dma_code=");
		builder.append(dma_code);
		builder.append(", region=");
		builder.append(region);
		builder.append(", continent_code=");
		builder.append(continent_code);
		builder.append(", area_code=");
		builder.append(area_code);
		builder.append(", isp=");
		builder.append(isp);
		builder.append(", country_code=");
		builder.append(country_code);
		builder.append(", country=");
		builder.append(country);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", city=");
		builder.append(city);
		builder.append(", timezone=");
		builder.append(timezone);
		builder.append(", region_code=");
		builder.append(region_code);
		builder.append(", country_code3=");
		builder.append(country_code3);
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

geoapi
======

Open source API for GeoIP address.
Its an open source utility java archive, which internally uses Telize.com as source system for Geolocation information.

It can be easily integrated into any java program.

How to integrate?
  1. Download the latest jar file and use it.

How to use?
  Just two lines of coding.,
* GeoApiService service = new GeoApiServiceImpl();
* GeoAddress address = service.getAddressByIp("98.228.255.100");
* System.out.println("address;"+address);


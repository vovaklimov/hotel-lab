package com.github.vovaklimov.hotel.server.jaxws;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        final var hotelEndpointUrl = Config.getBaseUrl() + "/hotel?wsdl";
        var hotelEndpoint = Endpoint.publish(hotelEndpointUrl, new HotelWebService());
        System.out.printf("Hotel JAX-WS service is available on %s \uD83D\uDE80%n", hotelEndpointUrl);
    }
}

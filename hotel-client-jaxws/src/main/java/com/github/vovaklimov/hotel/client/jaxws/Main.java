package com.github.vovaklimov.hotel.client.jaxws;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import generated.com.github.vovaklimov.hotel.server.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    private static final HotelWebService hotelWebService = new HotelWebServiceService().getHotelWebServicePort();
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        System.out.println("Creating a Room...");
        System.out.println("Room created:");
        System.out.println(gson.toJson(createRoom()));

        System.out.println("Creating a Client...");
        System.out.println("Client created:");
        System.out.println(gson.toJson(createClient()));

        System.out.println("Creating a Booking...");
        System.out.println("Booking created:");
        System.out.println(gson.toJson(createBooking()));

        System.out.println("All rooms:");
        System.out.println(gson.toJson(getRooms()));

        System.out.println("All bookings:");
        System.out.println(gson.toJson(getBookings()));
    }

    public static Client createClient() {
        var address = new Address();
        address.setCity("Kyiv");
        address.setRegion("Kyiv");
        address.setStreet("Chreschshatyk");
        address.setPostalCode(new BigInteger("3800"));

        var client = new CreateClientDTO();
        client.setName("Volodymyr");
        client.setAddress(address);
        var phoneNumber = new Contact();
        phoneNumber.setPhone("+380959473463");
        client.getContacts().add(phoneNumber);

        return hotelWebService.createClient(client);
    }

    public static Room createRoom() {
        var room = new CreateRoomDTO();
        room.setNumber(123);
        room.setDescription("An awesome beautiful room!");
        var price = new Money();
        price.setAmount(new BigDecimal("1000"));
        price.setCurrency(Currency.UAH);
        room.setPrice(price);
        room.setSleeps(2);
        room.setSquare(20);

        return hotelWebService.createRoom(room);
    }

    public static Booking createBooking() {
        var booking = new CreateBookingDTO();
        booking.setClientId(1L);
        booking.setRoomId(1L);
        booking.setFromDate(LocalDateTime.now().toString());
        booking.setToDate(LocalDateTime.now().plusDays(1).toString());
        return hotelWebService.createBooking(booking);
    }

    public static List<Booking> getBookings() {
        return hotelWebService.getBookings();
    }

    public static List<Room> getRooms() {
        return hotelWebService.getRooms();
    }
}

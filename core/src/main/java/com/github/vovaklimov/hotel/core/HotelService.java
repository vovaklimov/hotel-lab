package com.github.vovaklimov.hotel.core;

import com.github.vovaklimov.hotel.core.entities.Booking;
import com.github.vovaklimov.hotel.core.entities.Client;
import com.github.vovaklimov.hotel.core.entities.Room;
import com.github.vovaklimov.hotel.core.values.Contact;
import com.github.vovaklimov.hotel.core.values.Address;
import com.github.vovaklimov.hotel.core.values.Money;
import com.github.vovaklimov.hotel.core.values.TimeRange;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class HotelService {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

    public Room createRoom(Money price, int number, int sleeps, String description, int square) {
        var em = entityManagerFactory.createEntityManager();
        var trx = em.getTransaction();
        trx.begin();
        Room room = new Room(number, description, price, sleeps, square);
        em.persist(room);
        trx.commit();
        em.close();
        return room;
    }

    public List<Room> getRooms() {
        var em = entityManagerFactory.createEntityManager();
        return em.createQuery("select room from Room room").getResultList();
    }

    public Client createClient(String name, Address address, List<Contact> contacts) {
        var em = entityManagerFactory.createEntityManager();
        var client = new Client(name, address);
        contacts.forEach(client::addContact);
        var trx = em.getTransaction();
        trx.begin();
        em.persist(client);
        trx.commit();
        em.close();
        return client;
    }

    public Booking createBooking(Long clientId, Long roomId, TimeRange timeRange) {
        var em = entityManagerFactory.createEntityManager();
        var booking = new Booking(clientId, roomId, timeRange);
        var trx = em.getTransaction();
        trx.begin();
        em.persist(booking);
        trx.commit();

        return booking;
    }

    public List<Booking> getBookings() {
        var em = entityManagerFactory.createEntityManager();
        return em.createQuery("select b from Booking b").getResultList();
    }
}

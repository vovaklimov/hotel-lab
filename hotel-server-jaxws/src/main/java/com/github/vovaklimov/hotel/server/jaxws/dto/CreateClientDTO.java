package com.github.vovaklimov.hotel.server.jaxws.dto;

import com.github.vovaklimov.hotel.core.values.Address;
import com.github.vovaklimov.hotel.core.values.Contact;

import java.util.ArrayList;
import java.util.List;

public class CreateClientDTO {
    private String name;
    private List<Contact> contacts = new ArrayList<>();
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}

package com.github.vovaklimov.hotel.core.entities;

import com.github.vovaklimov.hotel.core.values.Address;
import com.github.vovaklimov.hotel.core.values.Contact;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client extends EntityWithId<Long> {
    @OneToMany(targetEntity = Contact.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private final List<Contact> contacts = new ArrayList<>();
    public String name;
    private Address address;

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Client() {
    }

    @Embedded
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Client addContact(Contact contact) {
        this.contacts.add(contact);
        return this;
    }

    public boolean removeContact(Contact contact) {
        return this.contacts.removeIf((contact::equals));
    }
}

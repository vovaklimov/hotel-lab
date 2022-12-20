package com.github.vovaklimov.hotel.core.entities;

import com.github.vovaklimov.hotel.core.values.Money;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Room extends EntityWithId<Long> {
    public String description;
    public Integer number;
    @Embedded
    public Money price;
    public Integer sleeps;
    public int square;

    public Room(Integer number, String description, Money price, Integer sleeps, int square) {
        this.description = description;
        this.number = number;
        this.price = price;
        this.sleeps = sleeps;
        this.square = square;
    }

    protected Room() {
    }
}

package com.github.vovaklimov.hotel.core.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
abstract class EntityWithId<T extends Long> {
    @Id
    @GeneratedValue
    private T id;

    public void setId(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}

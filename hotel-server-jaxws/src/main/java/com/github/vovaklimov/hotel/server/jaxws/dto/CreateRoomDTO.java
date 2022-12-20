package com.github.vovaklimov.hotel.server.jaxws.dto;

import com.github.vovaklimov.hotel.core.values.Money;

public class CreateRoomDTO {
    private Money price;
    private Integer number;
    private Integer sleeps;
    private String description;
    private Integer square;

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSleeps() {
        return sleeps;
    }

    public void setSleeps(Integer sleeps) {
        this.sleeps = sleeps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }
}

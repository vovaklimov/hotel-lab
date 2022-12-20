package com.github.vovaklimov.hotel.core.values;

import jakarta.persistence.Embeddable;

import java.math.BigInteger;

@Embeddable
public class Address {

    protected BigInteger postalCode;
    protected String street;
    protected String city;
    protected String region;

    public BigInteger getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(BigInteger value) {
        this.postalCode = value;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String value) {
        this.region = value;
    }

}

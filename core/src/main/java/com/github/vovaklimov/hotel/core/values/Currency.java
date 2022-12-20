package com.github.vovaklimov.hotel.core.values;

public enum Currency {
    USD("USD"),
    UAH("UAH"),
    EUR("EUR");

    private final String name;

    Currency(String currencyName) {
        this.name = currencyName;
    }

    public String getName() {
        return name;
    }
}

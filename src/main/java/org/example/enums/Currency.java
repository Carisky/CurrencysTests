package org.example.enums;

public enum Currency {

    USD(1),
    EUR(1.11),
    GBR(1.23),
    YEN(0.0068);
    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}

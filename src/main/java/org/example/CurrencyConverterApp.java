package org.example;

import org.example.enums.Currency;

import static org.example.Convertor.Convertor.convertCurrency;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        double amount = 100.0;

        convertCurrency(amount, Currency.USD, Currency.EUR);
        convertCurrency(amount, Currency.USD, Currency.GBR);
        convertCurrency(amount, Currency.USD, Currency.YEN);
    }
}

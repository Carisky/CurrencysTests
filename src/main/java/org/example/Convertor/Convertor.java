package org.example.Convertor;

import org.example.enums.Currency;

public class Convertor {
    public static double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        double convertedAmount = amount * fromCurrency.getRate() / toCurrency.getRate();

        System.out.println(amount + " " + fromCurrency + " is equal to " +
                convertedAmount + " " + toCurrency);

        return convertedAmount;
    }
}

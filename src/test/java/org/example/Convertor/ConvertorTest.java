package org.example.Convertor;

import org.example.enums.Currency;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @Test
    void convertCurrency() {
        double delta = 0.1;

        assertEquals(90.0, Convertor.convertCurrency(100.0, Currency.USD, Currency.EUR), delta);
    }
}
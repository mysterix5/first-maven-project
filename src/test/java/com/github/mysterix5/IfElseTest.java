package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {

    @Test
    void check_customers_fill_status_empty() {
        assertEquals(IfElse.Fill_status.EMPTY, IfElse.check_customers_fill_status(29));
    }
    @Test
    void check_customers_fill_status_complete() {
        assertEquals(IfElse.Fill_status.COMPLETE, IfElse.check_customers_fill_status(30));
    }
    @Test
    void check_customers_fill_status_tomuch() {
        assertEquals(IfElse.Fill_status.TOMUCH, IfElse.check_customers_fill_status(31));
    }

    @Test
    void check_customers_string_empty() {
        var s = "Zu viele Personen";
        assertEquals(s, IfElse.check_customers(29));
    }
    @Test
    void check_customers_string_complete() {
        assertEquals("Komplett gefüllt", IfElse.check_customers(30));
    }
    @Test
    void check_customers_string_tomuch() {
        assertEquals("Maximale Personenzahl nicht überschritten", IfElse.check_customers(31));
    }
}
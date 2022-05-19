package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {
    @Test
    void check_customers_fill_status_empty() {
        assertEquals(IfElse.FillStatus.EMPTY, IfElse.check_customers_fill_status(IfElse.alarm_border-1,IfElse.alarm_border));
    }
    @Test
    void check_customers_fill_status_complete() {
        assertEquals(IfElse.FillStatus.COMPLETE, IfElse.check_customers_fill_status(IfElse.alarm_border,IfElse.alarm_border));
    }
    @Test
    void check_customers_fill_status_tomuch() {
        assertEquals(IfElse.FillStatus.TOMUCH, IfElse.check_customers_fill_status(IfElse.alarm_border+1,IfElse.alarm_border));
    }

    @Test
    void check_customers_string_empty() {
        var s = "Zu viele Personen";
        assertEquals(s, IfElse.check_customers(IfElse.alarm_border+1));
    }
    @Test
    void check_customers_string_complete() {
        assertEquals("Komplett gefüllt", IfElse.check_customers(IfElse.alarm_border));
    }
    @Test
    void check_customers_string_tomuch() {
        assertEquals("Maximale Personenzahl nicht überschritten", IfElse.check_customers(IfElse.alarm_border-1));
    }

    @Test
    void check_all_interesting_possible_combinations_of_check_customers_with_alert_level(){
        var alarm_levels = new IfElse.AlertLevel[]{
                IfElse.AlertLevel.GREEN, IfElse.AlertLevel.RED, IfElse.AlertLevel.YELLOW
        };

        for (var lvl: alarm_levels){
            int lvl_int = lvl.getLevel();
            assertEquals("Maximale Personenzahl nicht überschritten", IfElse.check_customers_with_alert_level(lvl_int - 1, lvl));

            assertEquals("Komplett gefüllt", IfElse.check_customers_with_alert_level(lvl_int, lvl));
            assertEquals("Zu viele Personen", IfElse.check_customers_with_alert_level(lvl_int+1, lvl));
        }
    }

    public IfElse.AlertLevel[] alarm_levels = new IfElse.AlertLevel[]{
            IfElse.AlertLevel.GREEN, IfElse.AlertLevel.RED, IfElse.AlertLevel.YELLOW
    };

}

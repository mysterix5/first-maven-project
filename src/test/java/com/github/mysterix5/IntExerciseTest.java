package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntExerciseTest {

    @Test
    void check_overly_big_int() {
        int small = 100;
        int big = 101;
        int negative = -1;

        assertFalse(IntExercise.check_overly_big_number(small));
        assertTrue(IntExercise.check_overly_big_number(big));
        assertFalse(IntExercise.check_overly_big_number(negative));
    }
    @Test
    void tests_overly_big_int_should_be_true() {
        int big = 101;

        assertTrue(IntExercise.check_overly_big_number(big));
    }

    @Test
    void add() {

        int a = 5;
        int b = 6;
        int c = -1;

        assertEquals(11, IntExercise.add(a, b));
        assertEquals(4, IntExercise.add(a, c));
    }

    @Test
    void smaller() {
        int a = 3;
        int b = 4;

        assertTrue(IntExercise.smaller(a,b));
        assertFalse(IntExercise.smaller(a,a));
    }

    @Test
    void equal() {
        int a = 3;
        int b = 4;

        assertTrue(IntExercise.equal(a,a));
        assertFalse(IntExercise.equal(a,b));
    }

}
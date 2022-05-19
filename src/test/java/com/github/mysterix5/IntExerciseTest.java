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

    @Test
    void faculty_of_zero() {
        int myfac = IntExercise.faculty_for(0);
        assertEquals(myfac, 1);
    }
    @Test
    void faculty_of_one() {
        int myfac = IntExercise.faculty_for(1);
        assertEquals(myfac, 1);
    }
    @Test
    void faculty_of_twelve() {
        int myfac = IntExercise.faculty_for(12);
        assertEquals(myfac, 479001600);
    }
    @Test
    void more_faculty_tests() {
        assertEquals(IntExercise.faculty_for(2), 2);
        assertEquals(IntExercise.faculty_for(3), 6);
        assertEquals(IntExercise.faculty_for(4), 24);
        assertEquals(IntExercise.faculty_for(5), 120);
        assertEquals(IntExercise.faculty_for(6), 720);
        assertEquals(IntExercise.faculty_for(7), 5040);
        assertEquals(IntExercise.faculty_for(8), 40320);
        assertEquals(IntExercise.faculty_for(9), 362880);
        assertEquals(IntExercise.faculty_for(10), 3628800);
        assertEquals(IntExercise.faculty_for(11), 39916800);
        assertEquals(IntExercise.faculty_for(12), 479001600);
    }

    @Test
    void faculty_large_test(){
        assertEquals(IntExercise.faculty_rec_long(13), 6227020800L);
        assertEquals(IntExercise.faculty_rec_long(14), 87178291200L);
    }

    @Test
    void faculty_rec_against_faculty_for_zero_to_twelve() {
        for (int i = 0; i<=12; i++)
            assertEquals(IntExercise.faculty_rec(i), IntExercise.faculty_for(i));
    }
    @Test
    void faculty_while_against_faculty_for_zero_to_twelve() {
        for (int i = 0; i<=12; i++) {
            assertEquals(IntExercise.faculty_while(i), IntExercise.faculty_for(i));
        }
    }

    @Test
    void sumup_array(){
        int[] numarray = new int[]{1,2,3,4};
        int sum = IntExercise.sumup_array(numarray);
        assertEquals(10, sum);
    }
}
package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExerciseTest {

    @Test
    void test_string_checker_match() {
        // given
        String should_return_true = "sadfdsadfasdfancyasdfasdfasd";
        // when
        boolean result_true = StringExercise.string_checker(should_return_true);
        // then
        assertTrue(result_true);
    }
    @Test
    void test_string_checker_nofancy() {
        // given
        String should_return_true = "sadfdsadfasdggggggggsdfasdfasd";
        // when
        boolean result = StringExercise.string_checker(should_return_true);
        // then
        assertFalse(result);
    }
    @Test
    void test_string_checker_short() {
        // given
        String should_return_true = "sadfdsadsdfasd";
        // when
        boolean result = StringExercise.string_checker(should_return_true);
        // then
        assertFalse(result);
    }

}
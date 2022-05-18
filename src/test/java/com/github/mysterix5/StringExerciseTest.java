package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExerciseTest {

    @Test
    void test_string_checker_asdf() {
        // given
        String should_return_true = "sadfdsadfasdfancyasdfasdfasd";
        // when
        boolean result_true = StringExercise.string_checker(should_return_true);
        System.out.println("testing " + should_return_true + " result: " + result_true);
        // then
        assertTrue(result_true);
    }

}
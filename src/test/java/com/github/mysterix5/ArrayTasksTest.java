package com.github.mysterix5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTasksTest {

    @Test
    void create_string_array_students_3() {
        var test_array = new String[]{"Student 1", "Student 2", "Student 3"};
        var the_created_array = ArrayTasks.create_string_array_students(3);
        assertArrayEquals(test_array, the_created_array);
    }
    @Test
    void create_string_array_students_0() {
        var test_array = new String[]{};
        var the_created_array = ArrayTasks.create_string_array_students(0);
        assertArrayEquals(test_array, the_created_array);
    }
    @Test
    void create_string_array_students_negative() {
        var test_array = new String[]{};
        var the_created_array = ArrayTasks.create_string_array_students(-1);
        assertArrayEquals(test_array, the_created_array);
    }
}
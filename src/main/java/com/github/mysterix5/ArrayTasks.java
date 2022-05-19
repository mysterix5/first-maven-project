package com.github.mysterix5;

public class ArrayTasks {

    public static void main(String[] args) {

    }



    static String[] create_string_array_students(int array_len){
        if(array_len<0) return new String[0];
        String[] students = new String[array_len];
        for(int i = 0; i<array_len; i++){
            students[i] = "Student " + (i+1);
        }
        return students;
    }
}

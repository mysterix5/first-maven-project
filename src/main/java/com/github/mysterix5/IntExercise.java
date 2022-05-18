package com.github.mysterix5;

public class IntExercise {

    static boolean check_overly_big_number(int input_int){
        return input_int > 100;
    }
    static int add(int a, int b){
        if(check_overly_big_number(a) || check_overly_big_number(b)){
            throw new IllegalArgumentException("Die Zahlen, die addiert werden sollen, müssen <= 100 sein");
        }
        return a+b;
    }

    static boolean smaller(int a, int b){
        return a<b;
    }
    static boolean equal(int a, int b){
        return a==b;
    }

    static void print_sum(int number){
        System.out.println("Summe: " + number);
    }
}

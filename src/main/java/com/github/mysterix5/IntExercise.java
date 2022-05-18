package com.github.mysterix5;

public class IntExercise {
    static int add(int a, int b){
        if(a>100 || b>100){
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

package com.github.mysterix5;

public class IntExercise {

    public static void main(String[] args) {
        int faculty_of = 14;
        for(int i = 0; i<50;i++) {
            System.out.println("compute faculty of " + i);
            int res = faculty_rec(i);
            System.out.println("result: " + res);
        }
    }

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

    static int faculty_for(int number) {
        if (number < 0 || number > 12){
            System.out.println("ungültiger input");
            return -1;
        }
        int return_value = 1;
        for(int i = 2; i<=number;i++){
            return_value*=i;
        }
        return return_value;
    }

    static int faculty_rec(int number){
        if (number == 0 || number == 1) return 1;
        return number*faculty_rec(number-1);
    }
    static long faculty_rec_long(int number){
        if (number == 0 || number == 1) return 1;
        long n = (long)number;
        return n*faculty_rec_long(number-1);
    }

    static int faculty_while(int number){
        int fac = 1;
        while(number>1){
            fac *= number;
            number--;
        }
        return fac;
    }

    static int sumup_array(int[] numbers){
        int array_len = numbers.length;
        int mid_index = array_len/2;
        System.out.println("Numbers: " + print_array(numbers) + ", mid: " + mid_index + ", end: " + array_len);
        return sumup_array_rec(numbers, 0, mid_index) + sumup_array_rec(numbers, mid_index, array_len);
    }

    private static int sumup_array_rec(int[] numbers, int start, int end){
        System.out.println("Numbers: " + print_array(numbers) + ", start: " + start + ", end: " + end);
        if(start == end -1) {
            System.out.println("Eintrag gefunden: " + numbers[start]);
            return numbers[start];
        }

        int mid_index = start + (end-start)/2;
        return sumup_array_rec(numbers, start, mid_index) + sumup_array_rec(numbers, mid_index, end);
    }


    static String print_array(int[] numbers){
        String s = "[";
        for (int num: numbers) s=s + num + " ";
        return s+"]";
    }
}

package com.github.mysterix5;

public class InfiniteBeer {
    public static void main(String[] args){
        drinkBeer(5);
        sweatBeer(5);

        find_random_number(9);
    }
    public static void drinkBeer(int amountOfBeer){
        int i;
        for(i = 0;i < amountOfBeer; i++){
        }
        System.out.println(i + " Biere getrunken");
    }
    public static void sweatBeer(int amountOfBeer){
        int i;
        for(i = 0;i < amountOfBeer; i--){
//            System.out.println(i);
        }
        System.out.println(i + " Biere vernichtet");
    }

    public static void find_random_number(int to_find){
        int counter = 0;
        while(true){
            counter++;
            System.out.print(counter + ": ");
            int random_number = (int) (Math.random()*1000000.0);
            if (random_number == to_find){
                System.out.println(": Zahl ist " + to_find);
                break;
            }
            System.out.println("Random number is " + random_number);
        }
    }
}

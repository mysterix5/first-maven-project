package com.github.mysterix5;

public class IfElse {
    public static void main(String[] args){
        System.out.println("hallo welt");
    }

    static String check_customers(int n_customers){
        Fill_status filled = check_customers_fill_status(n_customers);
        switch (filled){
            case EMPTY: return "Zu viele Personen";
            case COMPLETE: return "Komplett gefüllt";
            case TOMUCH: return "Maximale Personenzahl nicht überschritten";
        }
        return "return";
    }
    public enum Fill_status {EMPTY, COMPLETE, TOMUCH}
    static Fill_status check_customers_fill_status(int to_be_checked){
        if (to_be_checked < 30) return Fill_status.EMPTY;
        if (to_be_checked > 30) return Fill_status.TOMUCH;
        return Fill_status.COMPLETE;

    }

}

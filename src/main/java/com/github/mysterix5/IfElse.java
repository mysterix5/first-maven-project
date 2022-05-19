package com.github.mysterix5;

public class IfElse {

    public static int alarm_border = 30;
    public static void main(String[] args){
        System.out.println("hallo welt");
        System.out.println(check_customers(alarm_border-1));
        System.out.println(check_customers(alarm_border));
        System.out.println(check_customers(alarm_border+1));
    }

    public enum FillStatus {EMPTY, COMPLETE, TOMUCH}
    public enum AlertLevel {
        RED(0), YELLOW(30), GREEN(60);
        //Instance variable
        private final int level;
        //Constructor to initialize the instance variable
        AlertLevel(int level) {
            this.level = level;
        }
        public int getLevel() {
            return this.level;
        }
    }

    static String check_customers_with_alert_level(int n_customers, AlertLevel alert_level){
        int albo = alert_level.getLevel();
        FillStatus filled = check_customers_fill_status(n_customers, albo);
        var status = customer_status_feedback(filled);
        System.out.println("customers: " + n_customers + ", alert_level: " + alert_level + ", status: " + status);
        return status;
    }


    static String check_customers(int n_customers){
        FillStatus filled = check_customers_fill_status(n_customers, alarm_border);
        return customer_status_feedback(filled);
    }
    static String customer_status_feedback(FillStatus fill_status){
        switch (fill_status){
            case TOMUCH: return "Zu viele Personen";
            case COMPLETE: return "Komplett gefüllt";
            case EMPTY: return "Maximale Personenzahl nicht überschritten";
            default: return "FAILURE, CHAOS, CATASTROPHE";
        }
    }
    static FillStatus check_customers_fill_status(int to_be_checked, int alarm_border){
        if (to_be_checked < alarm_border) return FillStatus.EMPTY;
        if (to_be_checked > alarm_border) return FillStatus.TOMUCH;
        return FillStatus.COMPLETE;
    }

}

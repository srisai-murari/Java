package Aon.test;

public class DateAndDay {
    public static void main(String[] args) {
        int date = 5;
        int month = 12;
        int year = 2005;

        if(month <= 2){
            month = month + 12;
            year--;
        }

        int K = year % 100;
        int J = year / 100;
        int day = ( date + (((month + 1) * 13) / 5) + K + (K / 4) + (J / 4) + 5 * J ) % 7;
        System.out.println(day);
    }
}

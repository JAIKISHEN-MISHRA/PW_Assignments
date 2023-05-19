//Program to display Current date and time
import java.time.*;
public class Q1_DateTime {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();
        System.out.println("Today's Date is:"+d);
        System.out.println("Time is:"+t);
    }
} 


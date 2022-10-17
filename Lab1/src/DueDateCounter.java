import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DueDateCounter {
    public static LocalDate lab1Date = LocalDate.of(2022,9,27);
    public static LocalDate lab2Date = LocalDate.of(2022,10,26);
    public static LocalDate lab3Date = LocalDate.of(2022,11,23);
    public static LocalDate lab4Date = LocalDate.of(2022,12,7);


    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to see days until all due dates[insert Y], or select your own date[insert N]");
        while(scan.hasNext()){
            if(scan.next().equals("Y")){
                System.out.println("There are " + date.until(lab1Date, ChronoUnit.DAYS) + " day(s) until lab 1 is due");
                System.out.println("There are " + date.until(lab2Date, ChronoUnit.DAYS) + " day(s) until lab 2 is due");
                System.out.println("There are " + date.until(lab3Date, ChronoUnit.DAYS) + " day(s) until lab 3 is due");
                System.out.println("There are " + date.until(lab4Date, ChronoUnit.DAYS) + " day(s) until lab 4 is due");
            }
            else if(scan.next().equals("N")){
                System.out.println("Enter your date in");
            }
        }
        


    }
}

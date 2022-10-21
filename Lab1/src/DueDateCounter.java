import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class DueDateCounter {
    //these are baked in dates that represent the preset assignment due dates
    public static LocalDate lab1Date = LocalDate.of(2022,9,27);
    public static LocalDate lab2Date = LocalDate.of(2022,10,26);
    public static LocalDate lab3Date = LocalDate.of(2022,11,23);
    public static LocalDate lab4Date = LocalDate.of(2022,12,7);

    public static long getDaysBetween(LocalDate from, LocalDate to){//returns the number of days between two local dates
        return from.until(to, ChronoUnit.DAYS);
    }


    public static void main(String[] args){
        LocalDate date = LocalDate.now();//this gets the current date by way of a LocalDate object
        Scanner scan = new Scanner(System.in);//scanner for reading in input
        System.out.println("Would you like to see days until all due dates[insert Y], or select your own date?[insert N]");
        while(scan.hasNext()){
            String optionResponse = scan.next();
            if(optionResponse.equals("Y")){
                System.out.println("There are " + getDaysBetween(date,lab1Date) + " day(s) until lab 1 is due");
                System.out.println("There are " + getDaysBetween(date,lab2Date) + " day(s) until lab 2 is due");
                System.out.println("There are " + getDaysBetween(date,lab3Date) + " day(s) until lab 3 is due");
                System.out.println("There are " + getDaysBetween(date,lab4Date) + " day(s) until lab 4 is due");
            }
            else if(optionResponse.equals("N")){
                System.out.println("Enter your date in MM/DD/YYYY or MM-DD formats. If using MM-DD, the year will default to the next year");
                String customDate = scan.next();
                Pattern pattern1 = Pattern.compile("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$");//this uses a regex to find dates listed in MM/DD/YYYY format
                Pattern pattern2 = Pattern.compile("^[0-9]{1,2}\\-[0-9]{1,2}$");//this uses a regex to find dates listed in MM-DD format
                if(pattern1.matcher(customDate).find()) {
                    String[] parsedDate = customDate.split("/");
                    LocalDate newDate = LocalDate.of(Integer.parseInt(parsedDate[2]),Integer.parseInt(parsedDate[0]),Integer.parseInt(parsedDate[1]));
                    System.out.println("There are "+getDaysBetween(date,newDate) + " day(s) until your custom date");
                }
                else if(pattern2.matcher(customDate).find()){
                    String[] parsedDate = customDate.split("-");
                    LocalDate newDate = LocalDate.of(date.getYear()+1,Integer.parseInt(parsedDate[0]),Integer.parseInt(parsedDate[1]));//creates a new localdate object with a year of the current year plus 1
                    System.out.println("There are "+getDaysBetween(date, newDate) + " day(s) until your custom date");
                }
                else {
                    System.out.println("Error, try entering the dates in the correct format");
                    customDate = scan.next();
                }
                
            }
            System.out.println("Would you like to see days until all due dates[insert Y], or select your own date?[insert N]");
            optionResponse = scan.next();
        }
        


    }
}

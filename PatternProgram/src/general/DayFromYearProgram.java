package general;
//
//        Write a function in java that calculate the corresponding
//        day of the week for any particular date in the past or future

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayFromYearProgram {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int date = sc.nextInt();
//        int month = sc.nextInt();
//        int year = sc.nextInt();

        int date = 24;
        int month = 5;
        int year = 1983;


        String exactDay = getExactDay(date,month,year);

        System.out.println("The day of the week for " + date + "-" + month + "-" + year + " is " + exactDay);
    }

    private static String getExactDay(int date, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month ,date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        return dayOfWeek.toString();
    }


}

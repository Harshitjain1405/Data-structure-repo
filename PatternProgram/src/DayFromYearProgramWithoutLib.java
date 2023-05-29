//
//        Write a function in java that calculate the corresponding
//        day of the week for any particular date in the past or future with zeller's algorithm
//Notes is in the note folder

public class DayFromYearProgramWithoutLib {
    public static void main(String[] args) {

        int y = 1984;
        int m = 3;
        int d = 21;

        String day = calculateDayOfGivenDate(d,m,y);
        System.out.println("The day of the week for "+d+"/"+m+"/"+y+" is "+day);

    }

    private static String calculateDayOfGivenDate(int d, int m, int y) {
        if(m < 3){
            m = m + 12;
            y--;
        }
        int zeroBasedCentury = y / 100;
        int yearOfCentury = y % 100;


        int dayOfWeek = d + 13*(m + 1) / 5 + yearOfCentury + yearOfCentury / 4 + zeroBasedCentury / 4 + 5 * zeroBasedCentury;
        dayOfWeek = dayOfWeek % 7;


        String[] particularDayArr = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String particularDay = particularDayArr[(dayOfWeek  % 7)];

        return particularDay;

    }
}

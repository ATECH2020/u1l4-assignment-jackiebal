import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        //Reads ints from user
        int minutesAfterHour = time % 12;
        int degrees = minutesAfterHour * 12;

        System.out.println(degrees);

        /*
         *  your code goes here
         */

        // closing the scanner object
        scanner.close();
    }
}
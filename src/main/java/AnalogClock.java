import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
       

        //Reads ints from user
         int time = scanner.nextInt();

        //operations
        int minutesAfterHour = time % 60;
        int degrees = minutesAfterHour * 12;

        System.out.println(degrees);

        // closing the scanner object
        scanner.close();
    }
}
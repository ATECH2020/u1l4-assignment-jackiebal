import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        
        //finds number of desks for each class
        int class1Desks = (class1 / 2) + (class1 % 2);
        int class2Desks = (class2 / 2) + (class2 % 2)
        int class3Desks = (class3 / 2) + (class3 % 2);

        //finds total number of desks and prints it
        System.out.print(class1Desks + class2Desks + class3Desks);

        // closing the scanner object
        scanner.close();
    }
}
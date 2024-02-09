import java.util.Scanner;

public class Main {
    // Create a Scanner object to read input from the user
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        // Prompt the user to enter a number
        System.out.println("__________________________________");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("__________________________________");

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        System.out.println("__________________________________");
        // Close the scanner
        input.close();
    }
}

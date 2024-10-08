
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        // Request for input
        System.out.print("Enter a number greater than 1 for diamond generation: ");

        // Declaring and initializing variables
        // Setting input as number variable
        int number = input.nextInt();
        // Empty print line to step the diamond down one line
        System.out.println();
        // Declaring index variables externally
        // so they can be used in reverse for Outer Loop 2
        int y, x;

        // Outer loop 1
        // prints the first half diamond
        for (y = 1; y <= number; y++) {

            // Inner loop 1 print whitespaces inbetween
            for (x = 1; x <= number - y; x++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (x = 1; x <= y * 2 - 1; x++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (y = number - 1; y > 0; y--) {

            // Inner loop 1 print whitespaces inbetween
            for (x = 1; x <= number - y; x++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (x = 1; x <= y * 2 - 1; x++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
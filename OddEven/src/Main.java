import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine();
            // Quit program
            if (input.equals("end")) {
                break;
            }
                int number = Integer.parseInt(input);
                numbers.add(number);
        }

        System.out.println("Numbers entered: " + numbers);
        for (int num : numbers) {
            // Modulo operator
            if (num % 2 == 0) {
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        }
        // Stop reading user input
        scanner.close();
    }
}
public class Main {
    public static void main(String[] args) {
        // Declaring and initializing variables
        int number = 7;

        // Outer loop 1
        for (int y = 1; y <= number; y++) {

            // Inner loop 1 print whitespaces
            for (int x = 1; x <= number - y; x++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (int z = 1; z <= y * 2 - 1; z++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
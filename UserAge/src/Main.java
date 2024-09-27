import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age?: ");

        int age = input.nextInt();
        System.out.println("Your age is " + age);

        input.close();
    }
}
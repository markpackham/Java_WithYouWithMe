public class Main {

    // Starting value for sequence
    // If successful final value in sequence would be 8
    static int demoNumber = 6;

    public static void main(String[] args){

        System.out.println("Fibonacci sequence for the number " + demoNumber);

        for (int i = 0; i <= demoNumber; i++) {
            System.out.println(fibi(i));
        }
    }

    public static int fibi(int demoNumber) {
        if (demoNumber <= 1) {
            return demoNumber;
        }

        // Eg 0+1 = 1, 1+1 = 2, 1+2 = 3, 2+3 = 5
        return fibi(demoNumber - 1) + fibi(demoNumber - 2);
    }
}

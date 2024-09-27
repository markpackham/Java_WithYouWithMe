public class Main {

    public static void main(String[] args) {

        int[] marks = {65,132,95,125,116,110};
        int max = 0;

        for(int i: marks){
            if(i > max){
                max = i;
            }
        }
        System.out.println("The highest score is " + max);

    }
}
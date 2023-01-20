package _19_Loops_Increments_Decrement;

public class Main {
    public static void main(String[] args) {
        int reference_1 = 0;
        int reference_2 = 0;
        int number_2 = reference_1++;
        System.out.println("number_2 = " + number_2);
        System.out.println("reference_1 = " + reference_1);

        int number_3 = ++reference_2;
        System.out.println("number_3 = " + number_3);
        System.out.println("reference_2 = " + reference_2);
    }
}

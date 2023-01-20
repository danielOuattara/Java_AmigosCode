package _20_Enhanced_Loops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100};

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        Arrays.stream(numbers).forEach(System.out::println);

    }
}

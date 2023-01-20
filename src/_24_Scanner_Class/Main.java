package _24_Scanner_Class;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = scanner.nextLine().trim();
        System.out.println("username = " +userName);

        System.out.print("Enter your age : ");
        int userAge = scanner.nextInt();
        System.out.println("username = " +userAge);

        Date date = new Date();
        System.out.println(date);
        System.out.print("Enter your name : " );

        int userYearOfBirth = LocalDate.now().minusYears(userAge).getYear();
        System.out.println("User was born in " + userYearOfBirth);


    }
}

package _27_Passport_Example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passport uk_Passport = new Passport( "AZ9824435", LocalDate.of( 2025, 1, 24));
        Passport us_Passport = new Passport( "NK1329795", LocalDate.of( 2023, 04, 14));

    }

    static  class  Passport {
        String number;
        LocalDate expiryDate;


        Passport(String number, LocalDate expiryDate) {
            this.number = number;
            this.expiryDate = expiryDate;
        }
    }
}

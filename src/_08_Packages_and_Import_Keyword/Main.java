package _08_Packages_and_Import_Keyword;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println(dateNow);

        // importing fully
        java.sql.Date dateSql = new java.sql.Date(12);
        System.out.println(dateSql);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime  localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}

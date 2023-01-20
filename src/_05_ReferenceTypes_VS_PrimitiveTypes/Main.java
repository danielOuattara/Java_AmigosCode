package _05_ReferenceTypes_VS_PrimitiveTypes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //---------------------------
        int a = 10;
        int b = a;
        a = 100;
        System.out.println(b);
        //--------------------------
        Person alex = new Person("Alex");
        Person mariam = alex;
        System.out.println(alex.name + " " + mariam.name);
        mariam.name = "Mariam";
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }
    }
}

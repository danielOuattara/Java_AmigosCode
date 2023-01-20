package _21_Break_Continue;

public class Main {
    public static void main(String[] args) {

        String [] names = {"Anna", "Ali", "Bob", "Mike", "Daniel"};

        for (String name : names) {
            if(name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }

        System.out.println("----------------------------");

        for (String name : names) {
            if(name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
    }
}

package _25_Methods;

public class Main {

     public static int occurrencesCounter(char[] letters, char searchItem) {
         /* This method aims to count the occurrence of a given number and return that count */
         int countResult = 0;
         for (char letter : letters) {
             if(searchItem == letter) countResult++;
         }
         return countResult;

    }
    public static void main(String[] args) {
        char[] letters =  {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        // define a method that will count the number of occurrences for each letter in the array
        int result = occurrencesCounter(letters, 'A');
        System.out.println(result);
    }
}

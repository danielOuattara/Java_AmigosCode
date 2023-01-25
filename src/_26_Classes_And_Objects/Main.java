package _26_Classes_And_Objects;

public class Main {
    public static void main(String[] args) {
        Lens lensOne = new Lens("Canon", "85mm", true);
        Lens lensTwo = new Lens("Sony", "79mm", false);

        System.out.println(lensOne.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensOne.isPrime);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

package exercises;

import java.util.Scanner;

public class Execises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double myNumber;
        System.out.println("Write any decimal number.");
        myNumber = scanner.nextDouble();

        if (myNumber == 0) {
            System.out.println("0");
        } else if (myNumber > 0) {
            System.out.println("Positivt");
        } else {
            System.out.println("Negativt");
        }

        if (myNumber < 1) {
            System.out.println("Litet");
        } else if (myNumber > 1000000) {
            System.out.println("Stort");
        } else {
        }
    }
}

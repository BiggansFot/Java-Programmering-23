package exercises;

import java.util.Scanner;

public class Execises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Write any whole number.");
        myNumber = scanner.nextInt();

        int mySecondNumber;
        System.out.println("Write a second number.");
        mySecondNumber = scanner.nextInt();

        int myThirdNumber;
        System.out.println("And a third number.");
        myThirdNumber = scanner.nextInt();

        if (myNumber >= mySecondNumber && myNumber >= myThirdNumber) {
            System.out.println("The biggest number is: " + myNumber);
        } else if ( mySecondNumber >= myNumber && mySecondNumber >= myThirdNumber) {
            System.out.println("The biggest number is: " + mySecondNumber);
        } else {
            System.out.println("The biggest number is: " + myThirdNumber);
        }


    }
}

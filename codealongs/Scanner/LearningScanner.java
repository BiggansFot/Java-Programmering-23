package codealongs.Scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please choose a number.");
        myNumber = scanner.nextInt();

        System.out.println("Input the avaerage salary: ");
        double avgSalary = scanner.nextDouble();

        System.out.println("Enter a message:");
        String message = scanner.next();

        System.out.println("Input number: " + myNumber);
        System.out.println("The avarage salary is: " + avgSalary);
        System.out.println("The message is: " + message);
        }
    }


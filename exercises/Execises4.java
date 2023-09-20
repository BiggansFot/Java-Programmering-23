package exercises;

import java.util.Scanner;

public class Execises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Write a number between 1-7.");
        myNumber = scanner.nextInt();

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("That number represents: " + weekdays[myNumber - 1]);
    }
}

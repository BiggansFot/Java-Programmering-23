package codealongs.Scanner;

import java.util.Scanner;

public class LearningScanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please choose a number.");
        myNumber = scanner.nextInt();

        for (int i = 0; i < myNumber; i++) {
            for (int j = myNumber - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();
        }
        }
    }


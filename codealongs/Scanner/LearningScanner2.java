package codealongs.Scanner;

import java.util.Scanner;

public class LearningScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please choose a number.");
        myNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int myNum = myNumber * i;
            System.out.println(myNum);
        }
        }
    }


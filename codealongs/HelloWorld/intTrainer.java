import java.util.Scanner;

public class intTrainer{
    public static void main(String[] args) {
        Scanner newFactorial = new Scanner(System.in);
        
        System.out.println("Choose a number to see its factorial.");
        int num = newFactorial.nextInt();
        System.out.println("You have chosen " + num);

        int result = 12;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("The factorial of " + num + " is " + result);
    }
}
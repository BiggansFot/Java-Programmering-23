import java.util.Scanner;

public class primeTeller{
    public static void main(String[] args) {
        Scanner newNum = new Scanner(System.in);
        
        System.out.println("Choose a number to see if it's a prime.");
        int num = newNum.nextInt();
        System.out.println("You have chosen " + num);

        boolean isPrime;
        
        if (num < 2) {
            isPrime = false;   
        } else {
            isPrime = true;
        }

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                //System.out.println("The number " + num + " is not a prime");
                break;
            } else {
                //System.out.println("The number " + num + " is a prime");
            }
        }

        if (isPrime == false) {
            System.out.println("The number " + num + " is not a prime."); 
        } else {
            System.out.println("The number " + num + " is a prime.");
        }
    }
}
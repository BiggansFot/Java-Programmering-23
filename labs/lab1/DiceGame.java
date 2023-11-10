package labs.lab1;
import java.util.Scanner;

public class DiceGame {    
    public static void main(String[] args) {
        Player sonja = new Player();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rounds do you want to play?");
        int numberOfRounds = scan.nextInt();
        
        System.out.println("How many sides do you want your die to have?");
        int numberOfSides = scan.nextInt();
        sonja.addDice(numberOfSides);
        for (int x = 1; x <= numberOfRounds; x++) {
            System.out.println("What side do you think the die will land on?");
            int guessedSide = scan.nextInt();
            
            sonja.rollDice();
            System.out.println(sonja.getDiceValue());
            
            if (guessedSide == sonja.getDiceValue()) {
                sonja.increaseScore();
                System.out.println("You guessed correctly");
                System.out.println("your current score is " + sonja.getPoints());
            } else {
                System.out.println("You were incorrect");
            }
        }
        System.out.println("Your total score is " + sonja.getPoints());
    }
}

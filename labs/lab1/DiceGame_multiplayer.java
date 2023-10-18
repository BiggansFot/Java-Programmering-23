package labs.lab1;
import java.util.Scanner;

public class DiceGame_multiplayer {    
    public static void main(String[] args) {
        Player[] playerNameArray = {new Player("Lisa"), new Player("John"), new Player("Matt"), new Player("Ann")};
        Scanner scanPlayer = new Scanner(System.in);
        System.out.println("How many players will play? (maximum 4)");
        
        Scanner scanRounds = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int numberOfRounds = scanRounds.nextInt();
        
        Scanner scanSides = new Scanner(System.in);
        System.out.println("How many sides do you want your die to have?");
        int numberOfSides = scanSides.nextInt();
        for (Player p : playerNameArray) {
            p.addDice(numberOfSides);
        }
        
        Scanner scanDie = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        int numberOfDice = scanDie.nextInt();
        for ()

        private static void takeTurn(playerNameArray);

        for (int x = 1; x <= numberOfRounds; x++) {
            Scanner scanGuess = new Scanner(System.in);
            System.out.println("What side do you think the die will land on?");
            int guessedSide = scanGuess.nextInt();
            
            System.out.println(sonja.rollDice());
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

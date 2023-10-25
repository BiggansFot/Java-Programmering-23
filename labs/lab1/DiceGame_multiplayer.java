package labs.lab1;
import java.util.Scanner;

public class DiceGame_multiplayer {    
    public static void main(String[] args) {
        AdvancedPlayer[] playerNameArray = {new AdvancedPlayer("Lisa"), new AdvancedPlayer("John"), new AdvancedPlayer("Matt"), new AdvancedPlayer("Ann")};
        /* Scanner scanPlayer = new Scanner(System.in);
        System.out.println("How many players will play? (maximum 4)");
        int numberOfPlayers = scanPlayer.nextInt(); */
        
        Scanner scanRounds = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int numberOfRounds = scanRounds.nextInt();
        
        /* Scanner scanSides = new Scanner(System.in);
        System.out.println("How many sides do you want your die to have?");
        int numberOfSides = scanSides.nextInt();
        for (AdvancedPlayer p : playerNameArray) {
            p.addDice(numberOfSides);
        } */
        
        int totalScore = 0;
        int roundScore = 0;
        
        for (int i = 0; i <= numberOfRounds; i++) {
            Scanner scanDie = new Scanner(System.in);
            System.out.println("How many dice do you want to roll? (maximum 3)");
            int numberOfDice = scanDie.nextInt();
            for (AdvancedPlayer p : playerNameArray) {
                p.addDice(numberOfDice);
            }
            for (AdvancedPlayer p : playerNameArray) {
                p.rollDice();
                System.out.println(p.getName() + " rolled: ");
                p.getDiceValue();
                System.out.println("That totals: ");
                roundScore += p.getTotalValue();
                totalScore = totalScore + roundScore;
            }
            
            
        }
        for (AdvancedPlayer p : playerNameArray) {
            System.out.println(p.getName() + " got a total of:" + totalScore);
        }
        //System.out.println("Your total score is " + AdvancedPlayer.getPoints());
    }
}

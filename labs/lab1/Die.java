package labs.lab1;

import java.util.Random;

public class Die {
    private int sides;
    private int currentSide;
    Random randomGenerator = new Random();
    //Metod som tar fram en slumpad siffra mellan 0 och sides -1.
    int roll() {
        int result = randomGenerator.nextInt(sides) + 1;
        currentSide = result;
        return result;
    }
    //Gettermetod till currentSides.
    public int getCurrentSide() {
        return currentSide;
    }
    //Konstruktor för att allokera antal sidor på tärningen från scannerobjektet.
    Die(int sides) {
        this.sides = sides;
    }
    //Gettermetod till sides.
    public int getSides() {
        return sides;
    }
}

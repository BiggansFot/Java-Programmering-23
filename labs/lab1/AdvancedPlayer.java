package labs.lab1;

public class AdvancedPlayer {
    private String name;
    private int points;
    private Die[] dice = {new Die(4), new Die(6), new Die(8)};

    public String getName(){
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getDiceValue() {
        return d.getCurrentSide();
    }

    void increaseScore() {
        points++;
    }

    void rollDice() {
        for (Die d : dice) {
            d.roll();
        }
    }
}

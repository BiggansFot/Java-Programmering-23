package labs.lab1;

public class AdvancedPlayer {
    private String name;
    private int points;
    int score = 0;
    private Die[] dice = {new Die(4), new Die(6), new Die(8)};

    AdvancedPlayer(String name) {
        this.name = name;
    }

    void addDice(int sides) {
        for (Die d : dice) {
            d = new Die(sides);
        }
    }
    public String getName(){
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getTotalValue() {
        int totalValue = 0;
        for (Die d : dice) {
            totalValue += d.getCurrentSide();
        }
        System.out.println(totalValue);
        return totalValue;
    }

    public void getDiceValue() {
        for (Die d : dice) {
            System.out.println(d.getCurrentSide());
        }
    }

    public int increaseScore() {
        int score = score + getTotalValue();
        return score;
    }

    void rollDice() {
        for (Die d : dice) {
            d.roll();
        }
    }
}

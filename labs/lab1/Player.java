package labs.lab1;

public class Player {
    
        private String name;
        private int points;
        private Die die;
        //Gettermetod till name.
        public String getName() {
            return name;
        }
        //Gettermetod till points.
        public int getPoints() {
            return points;
        }
        //Settermetod till points.
        /* public void setPoints(int points) {
            this.points = points;
        } */
        //Rullar player-tärningen.
        int rollDice() {
            return die.roll();
        }
        //Hämtar resultatet av player tärningens nuvarande värde.
        public int getDiceValue() {
            return die.getCurrentSide();
        }
        //Ökar points med 1
        void increaseScore() {
            points++;
        }
        //Skapar en tärning knuten till player
        void addDice(int sides) {
            die = new Die(sides);
        }
}

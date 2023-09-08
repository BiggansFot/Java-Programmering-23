package codealongs.Print.finished;

public class LearningPrint {
    public static void main(String[] args) {
        System.out.println('\u00E4');

        int cars = 8;
        String myName = "Pär";
        System.out.println ("Hello, I am " + myName + " and I do not own " + cars + " cars.");

        System.out.printf(myName, args)
    }
}

class Parrot {
    String name = "Gösta";
}
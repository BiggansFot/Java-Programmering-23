package codealongs.Objects;


public class ObjectTrainer4 {
    public static void main(String[] args) {

        class car {
            String make;
            String model;
            int year;
            String color;

            car(String make, String model, int year, String color) {
                this.make = make;
                this.model = model;
                this.year = year;
                this.color = color;
            }

            car(String make) {
                this(make, null, 0, null);
            }

            
        }

        car volvo = new car("Volvo", "XC90", 2020, "Grey");
        car ford = new car("Ford");

        System.out.println("I want a " + volvo.make + " " + volvo.model + " from " + volvo.year + " in " + volvo.color);
        System.out.println("Not a " + ford.make);
    }
}
package codealongs.Objects;



public class Dog3 {
    Dog puppy = new Dog("Akita", "Silver", 4);
    

    public static void main(String[] args) {
        
        Dog pup = new Dog("German Shepard", "Black", 3);
        Dog puppers = new Dog("Bulldog", "Dark brown", 5);
        
        
        System.out.println("There is a " + pup.breed + " that is completely " + pup.color + " and is only " + pup.age + " years old.");
        System.out.println("There is a " + puppers.breed + " that is completely " + puppers.color + " and is only " + puppers.age + " years old.");


    }
}

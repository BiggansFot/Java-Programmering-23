package codealongs.Objects;



public class Dog3 {
    public static void main(String[] args) {
        Dog2 akita = new Dog2();

        akita.puppers.breed = "American Akita";
        akita.puppers.color = "black and white";
        akita.puppers.age = 5;
        
        System.out.println("Do you se that " + akita.puppers.breed + " that is " + akita.puppers.color);
        System.out.println("It is different from that " + akita.pup.breed);
        
        Dog bulldog = new Dog();
        bulldog.breed = "Bulldog";
        bulldog.color = "brown";
        bulldog.age = 7;

        Dog silver = akita.puppers;
        System.out.println("There is also a " + bulldog.breed);
        System.out.println("As well as another " + silver.breed);

        akita.puppers.breed = "Alaskan Malamut";

        System.out.println(akita.puppers.breed);
        System.out.println(silver.breed);

    }
}

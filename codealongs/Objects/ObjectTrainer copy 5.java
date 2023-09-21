package codealongs.Objects;


public class ObjectTrainer {
    public static void main(String[] args) {

        class Walrus{
            public int age;
            private double weight;
            protected String name;

        //    Walrus() {
        //        age = 10;
        //        weight = 150.0;
        //        name = "Default";
        //    }
        
            Walrus(int age, double weight, String name) {
                this.age = age;
                this.weight = weight;
                this.name = name;
            }
            
        }
        class Seal {
            int age;
            double weight;
            String name;
            String category;
        
            Seal(int x, double y, String z, String r) {
                age = x;
                weight = y;
                name = z;
                category = r;
            }
        }
        
        Walrus roland = new Walrus(5, 320.5, "Roland");
        Seal sophie = new Seal(5, 30.2, "Sophie", "Seal");

        System.out.println(roland.name + " is " + roland.age + " years old and weights " + roland.weight + "kg");
        System.out.println(sophie.name + " is a " + sophie.category + ", " + sophie.age + " years old and weights " + sophie.weight + "kg");
        
    }
}
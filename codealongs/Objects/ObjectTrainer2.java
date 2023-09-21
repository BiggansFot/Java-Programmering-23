package codealongs.Objects;


public class ObjectTrainer2 {
    public static void main(String[] args) {

        class book {
            String title;
            String author;
            int year;


            book() {
                this.title = title;
                this.author = author;
                this.year = year;
            }
        }
        
        book wind = new book();
        wind.title = "Name of the wind";
        wind.author = "Patrik Rothfuss";
        wind.year = 2007;
        System.out.println("My favorite book is " + wind.title + ", written by " + wind.author + " the year " + wind.year);
    }


}
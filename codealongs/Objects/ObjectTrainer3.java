package codealongs.Objects;


public class ObjectTrainer3 {
    public static void main(String[] args) {

        class student {
            String name;
            int age;
            double grade;

            student(String name, int age, double grade) {
                this.name = name;
                this.age = age;
                this.grade = grade;

            }
        }

        student sara = new student("Sara", 17, 4.5);

        System.out.println(sara.name + " is " + sara.age + " and are graded with " + sara.grade);
    }
}
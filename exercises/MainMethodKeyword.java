package exercises;

class Circle {
    double radius;
    double computeCircumference () {
        return radius * 3.14159 * 2;
    }
    double computeArea () {
        return 3.14159 * Math.pow(radius, 2);
    }
    Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    int base;
    int height;
    int computeArea() {
        return base * height;
    }
    int computePerimeter() {
        return base * 2 + height * 2;
    }
    Rectangle(int base, int height) {
        this.height = height;
        this.base = base;
    }
}

public class MainMethodKeyword {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(4.3);
        Rectangle rectangle1 = new Rectangle(4, 6);

        System.out.println(rectangle1.computeArea());
        System.out.println(rectangle1.computePerimeter());
        System.out.println(circle1.computeArea());
        System.out.println(circle1.computeCircumference());
    }
}

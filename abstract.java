
abstract class Shape {

    // abstract method (no implementation)
    abstract void draw();

    // normal method
    void message() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    // providing implementation
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class abstract {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}


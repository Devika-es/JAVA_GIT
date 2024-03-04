class Shape {
    void draw() {
        System.out.println("Drawing");
    }

    float calculateArea() {
        return 0.0f;
    }
}

class Circle extends Shape {
    float radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    float calculateArea() {
        return 3.14f * radius * radius;
    }
}

class Square extends Shape {
    float side;

    Square(float side) {
        this.side = side;
    }

    void draw() {
        System.out.println("Drawing Square");
    }

    float calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    float base;
    float height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    float calculateArea() {
        return 0.5f * base * height;
    }
}

public class overriding_examples {
    public static void main(String[] args) {

        Square square1 = new Square(6);
        square1.draw();
        System.out.println("Area: " + square1.calculateArea());
        Circle circle1 = new Circle(15);
        circle1.draw();
        System.out.println("Area: " + circle1.calculateArea());
        Triangle triangle1 = new Triangle(32, 15);
        triangle1.draw();
        System.out.println("Area: " + triangle1.calculateArea());

    }
}
package Class_Examples;
abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    int radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length = 4, width = 6;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.calculateArea();
    }
}
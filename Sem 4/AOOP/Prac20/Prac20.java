abstract class Shape {
    abstract void area(int a, int b);
}

class Triangle extends Shape {
    void area(int a, int b){
        System.out.println("Area of Triangle: " + (0.5*a*b));
    }
}

class Rectangle extends Shape {
    void area(int a, int b) {
        System.out.println("Area of Rectangle: " + (a*b));
    }
}

class Circle extends Shape {
    void area(int a, int b) {
        System.out.println("Area od Circle: " + (3.14*a*a));
    }
}

class Prac20 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        t1.area(2, 2);
        r1.area(2, 2);
        c1.area(1, 0);

    }
}
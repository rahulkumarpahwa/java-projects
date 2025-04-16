package CWH.OOPS.Intro.Practice;

public class P3 {
    public static void main(String[] args) {
        Shape square = new Shape(2);
        System.out.println(square.Area());
        System.out.println(square.Perimeter());

        Shape rectangle = new Shape(2, 3);
        System.out.println(rectangle.Area());
        System.out.println(rectangle.Perimeter());

        Shape circle = new Shape(3.0f);
            
        System.out.println(circle.CircleArea());
        System.out.println(circle.Circumference());

    }
}

class Shape {
    int x;
    int y;
    float r;

    Shape(int x) {
        this.x = x;
        this.y = x;
    }

    Shape(float r) {
        this.r = r;
    }

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int Area() {
        return this.x * this.y;
    }

    int Perimeter() {
        return (2 * (this.x + this.y));
    }

    float Circumference() {
        return (float) Math.PI * 2 * r; // Math.PI return double

    }

    float CircleArea() {
        return (float) Math.PI * r * r; // Math.PI return double
    }

}
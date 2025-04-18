package CWH.OOPS._4_Inheritance.Practice;
import java.text.DecimalFormat;

public class P1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.000");

        Circle c = new Circle(3);
        System.out.println("the area of the circle is "+ df.format(c.calcArea()));


        Cylinder c1 = new Cylinder(3, 2);
        System.out.println("The radius of the cylinder " + c1.getRad());
        System.out.println("The height of the cylinder " + c1.getHeight());
        System.out.println("the surface area of the cylinder is " + c1.calcArea());
        System.out.println("the Volume of the cylinder is " + c1.volume());
    }
}

class Circle {
    private int rad;

    Circle(int rad) {
        this.rad = rad;
    }

    int getRad() {
        return this.rad;
    }

    double calcArea() {
        return Math.PI * getRad() * getRad();
    }

}

class Cylinder extends Circle {
    private int height;

    Cylinder(int rad, int height) {
        super(rad);
        this.height = height;
    }

    int getHeight() {
        return this.height;
    }

    @Override
    double calcArea() {
        return 2 * Math.PI * getRad() * getHeight();
    }

    double volume(){
        return super.calcArea() * getHeight();
    }
}
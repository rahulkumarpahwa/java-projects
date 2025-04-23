public class P3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea();

        Triangle t = new Triangle();
        t.getArea();

        Circle2 c = new Circle2();
        c.getArea();
    }
}

interface Shape {
    public void getArea();
}

class Rectangle implements Shape {
    @Override
    public void getArea() {
        System.out.println("the Area of the Rectangle");
    }
}

class Circle2 implements Shape {
    @Override
    public void getArea() {
        System.out.println("the Area of the circle");
    }
}

class Triangle implements Shape {
    @Override
    public void getArea() {
        System.out.println("The Area of the Traingle");
    }
}
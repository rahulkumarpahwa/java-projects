public class P5 {
    public static void main(String[] args) {
        Circle3 c = new Circle3();
        c.draw();

        Rectangle2 r = new Rectangle2();
        r.draw();

        Triangle2 t = new Triangle2();
        t.draw();
    }
}


interface Drawable{
    public void draw();
}

class Circle3 implements Drawable{
@Override
public void draw() {
    System.out.println("Drawing the Circle!");
}
}

class Rectangle2 implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing the Rectangle");
    }
}

class Triangle2 implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing the Triangle");
    }
}





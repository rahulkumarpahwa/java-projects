package CWH.OOPS._4_Inheritance.Practice;

public class P2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println("the area of the rectangle is " + r.area());

        Cuboid c = new Cuboid(2, 3, 4);
        System.out.println("the total surface area of the cuboid is " + c.area());
        System.out.println("the volume of the cuboid is " + c.volume());

    }
}

class Rectangle {
    int x;
    int y;

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    int area() {
        return getX() * getY();
    }

}

class Cuboid extends Rectangle {
    private int z;

    Cuboid(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    int getZ() {
        return z;
    }

    @Override
    int area() {
        return 2 * ( super.area() +  getX() * getZ() +  getY() * getZ());
    }

    int volume() {
        return super.area() * getZ();
    }

}

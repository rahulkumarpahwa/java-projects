package CWH.OOPS._4_Inheritance;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Child ch = new Child(2, 3, 4);
        ch.PrintDetails();

        Child ch2 = new Child();
        ch2.PrintDetails();
    }
}

class GrandParent {
    int x;

    GrandParent() {
        System.out.println("The Grand Parent Constructor called!");

    }

    GrandParent(int x) {
        this.x = x;
        System.out.println("The Grand Parent Constructor called!");
    }

}

class Parent extends GrandParent {
    int y;

    Parent() {
        System.out.println("The Parent Constructor called!");

    }

    Parent(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("The Parent Constructor called!");
    }
}

class Child extends Parent {
    int z;

    Child() {
        System.out.println("The child Constructor called!");
    }

    Child(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("The child Constructor called!");
    }

    void PrintDetails() {
        System.out.println("the value of x, y and z is " + x + "," + y + "," + z);
    }

}

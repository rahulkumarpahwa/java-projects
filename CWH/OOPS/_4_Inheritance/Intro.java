package CWH.OOPS._4_Inheritance;

public class Intro {
    public static void main(String[] args) {
     Derived d = new Derived(34);
     d.getX();
     d.x = 45;
     d.getX();
     d.getY();

     
    }
}

class Base {
    int x;

    Base() {
        System.out.println("I am the Base class.");
    }

    void getX() {
        System.out.println("The Value of x is : " + this.x);
    }

}

class Derived extends Base {
    int y;

    Derived(int y) {
        super();
        this.y = y;
    }

    void getY(){
        System.out.println("The value of y is : "+ this.y);
    }
}

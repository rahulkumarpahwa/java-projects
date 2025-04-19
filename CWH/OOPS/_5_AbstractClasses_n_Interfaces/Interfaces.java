package CWH.OOPS._5_AbstractClasses_n_Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        System.out.println(ac.z); // access the instance variable.
        System.out.println(Bicycle.z); // access the final variable.

        ac.applyBrake(0);
        ac.speedUp(10);
        ac.SpecialHorn(); // method implemented from the second interface HornBicycle, showing the multiple inheritance.
    }
}


// 1st Interface
interface Bicycle {
    final int z = 34; // we must have it initialized. writing final is not necessary but it is
    // already final. means its value can't be changed. You can access it using the
    // Interface only generally but if the class does not have the variable with the
    // same name then you can access that way too.

    public void applyBrake(int decrement);

    public void speedUp(int increment);

}

// 2nd Interface
interface HornBicycle {
    public void SpecialHorn();

}

class AvonCycle implements Bicycle, HornBicycle {
    int z = 89; // can't override the Interface properties such as 'z'
    int decrement;
    int increment;

    AvonCycle() {
        decrement = 0;
        increment = 30;
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.printf("Applying Break decreasing speed to %d\n", decrement);
    }

    @Override
    public void speedUp(int increment) {
        System.out.printf("Applying race speed up to %d\n", increment);

    }

    public void horn() {
        System.out.println("PEEEEEEEEEEE!!!");
    }

    @Override
    public void SpecialHorn() {
        System.out.println("The Special Horn Activated!.........PEEEE POOO PEEE POOO");
    }
}

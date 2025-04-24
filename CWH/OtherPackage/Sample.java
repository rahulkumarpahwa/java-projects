package CWH.OtherPackage;
import CWH.Package.C1;

public class Sample {
    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println(c.x);
        // System.out.println(c.y); // This will cause a compilation error because `y` has protected access.
        // System.out.println(c.z); // This will cause a compilation error because `z` has default access.
        // System.out.println(c.a); // This will cause a compilation error because `a` has pivate access.

        c.print();
    }
}

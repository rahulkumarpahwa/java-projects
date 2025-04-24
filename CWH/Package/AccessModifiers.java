package CWH.Package;
// import CWH.Package.C1;

public class AccessModifiers {
    public static void main(String[] args) {
    C1 c = new C1();

    c.print();

    // In the same package, only the public, protected and default access modifiers are accessible.
    System.out.println(c.x);        
    System.out.println(c.y);        
    System.out.println(c.z);
    // System.out.println(c.a); // private can't access in the same package.
    
    
    subClass s = new subClass();
    
    s.print();

    // In the sub class, only the public and protected are accessible.
    System.out.println(s.x);        
    System.out.println(s.y);        
    System.out.println(s.z); // this is accessible because in the same package, althought it is private.
    // System.out.println(s.a); // private can't access in the same package.
    

    }
}

class subClass extends C1{

}


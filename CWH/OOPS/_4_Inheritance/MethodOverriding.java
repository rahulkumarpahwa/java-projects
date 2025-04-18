package CWH.OOPS._4_Inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.Method());
        a.Method2();
        System.out.println(b.Method());
        b.Method2();

    }
}

// Note : while Overriding a method the arguments passed must be same as before.
// means if there are no arguments passed then in overridden method it should
// not pass anything and similarly if pass then must pass in the overridden method as well.

// Note 2: the return type of the overridden class must be same as the super class or must be sub type of return of the super class.
// note 3: the access specifier of the sub class can't be restrictive from super class. Like the super class is public then sub class can't be private.
// note 4: we can't override the static method or final method.

class A {
    public int Method() {
        return 2;
    }

    public void Method2() {
        System.out.println("Hello World!");
    }
}

class B extends A {
    @Override
    public int Method() {
        return 34; // this method is overridden.
    }

    @Override // this is the annotation which tells us that this method is Override or not.
              // and when we change the method and still has the annotation we will then get
              // the error.
    public void Method2() {
        System.out.println("Hello this is Class B");
    }
}
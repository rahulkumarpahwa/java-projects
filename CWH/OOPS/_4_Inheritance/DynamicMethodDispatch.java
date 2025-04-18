package CWH.OOPS._4_Inheritance;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // basic : 
        Phone obj = new Phone();
        obj.name();
        SmartPhone sobj = new SmartPhone();
        sobj.greet();

        // case 1:
        Phone nobj = new SmartPhone(); // allowed // this is called as the dynamic method dispatch as the method to be
                                       // called is decided on the runtime when the object is created. (here the
                                       // decision is taken on which name method is to be called, the sub one or the
                                       // super class one.)
        nobj.greet(); // as the greet is single fxn so it will be called from the super class.
        nobj.name(); // as the obj created here is of smartphone so in case of method having the same
                     // name the smartphone's name fxn one will be called.

        // nobj.swagat(); // we can't call this method. only the methods in the
        // reference (super class) are allowed to call.

        // case 2:
        // SmartPhone nobj2 = new Phone(); // this is not allowed.

        // example : consider the phone as the Nokia's phone and consider the smartphone
        // as the new samsung phone and now when we write "Phone nobj = new
        // SmartPhone();"
        // then we re saying the smart phone is also a phone which is possible and hence
        // java does not show error. while the "SmartPhone nobj2 = new Phone();" then
        // this can't be possible because the nokia phone can't be smartphone.

    }
}

class Phone {
    public void name() {
        System.out.println("My name is method of the Class Phone.");
    }

    public void greet() {
        System.out.println("Good Morning!");
    }
}

class SmartPhone extends Phone {
    @Override
    public void name() {
        System.out.println("My name is method of the Class SmartPhone.");

    }

    public void swagat() {
        System.out.println("Apka Swagat hai! ");
    }
}
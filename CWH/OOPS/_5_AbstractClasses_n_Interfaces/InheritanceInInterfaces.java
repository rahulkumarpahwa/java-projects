package CWH.OOPS._5_AbstractClasses_n_Interfaces;

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        SampleClass s = new SampleClass();
        s.meth();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}

interface sampleInterface { // super interface
    void meth();

    void meth2();
}

interface sample2 extends sampleInterface { // yes, we can extends the interfaces. ie. we can use inheritance in the
                                            // interface too.
                                            // sub interface
    void meth3();

    void meth4();

}
// note : one interface can't implement the other interface but can extend only.

class SampleClass implements sample2 {
    @Override
    public void meth() {
        System.out.println("this is method one in sample class");

    }

    @Override
    public void meth2() {
        System.out.println("this is method two in sample class");

    }

    @Override
    public void meth3() {
        System.out.println("this is method third in sample class");

    }

    @Override
    public void meth4() {
        System.out.println("this is method fourth in sample class");

    }
}

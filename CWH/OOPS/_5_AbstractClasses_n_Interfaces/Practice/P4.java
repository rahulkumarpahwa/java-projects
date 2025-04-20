package CWH.OOPS._5_AbstractClasses_n_Interfaces.Practice;

public class P4 {
    public static void main(String[] args) {
        TV t = new TV();
        t.Method();
    }
}

interface TvRemote {
    public void Method();
}

interface SmartTvRemote extends TvRemote {
    void Method2();

}

class TV implements TvRemote {
    @Override
    public void Method() {
        System.out.println("This is class TV method implemented from the TvRemote Interface. ");
    }
}

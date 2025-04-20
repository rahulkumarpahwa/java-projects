package CWH.OOPS._5_AbstractClasses_n_Interfaces.Practice;

public class P3 {
    public static void main(String[] args) {
        SmartTelephone st = new SmartTelephone();
        st.disconnect();
        st.ring();
        st.lift();
    }
}


abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}


class SmartTelephone extends Telephone{
    @Override
    void ring() {
       System.out.println("This is ring method in SmartTelephone");
        
    }

    @Override
    void lift() {
        System.out.println("This is lift method in SmartTelephone");
        
    }
    @Override
    void disconnect() {
        System.out.println("This is disconnect method in SmartTelephone");

        
    }
}
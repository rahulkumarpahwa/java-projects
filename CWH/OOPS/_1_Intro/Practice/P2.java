package CWH.OOPS._1_Intro.Practice;

public class P2 {
    public static void main(String[] args) {
        CellPhone apple = new CellPhone();
        apple.Ring();
        apple.Snooze();
        
    }
}

class CellPhone{
    void Ring(){
        System.out.println("Ringing........");
    }
    void Snooze(){
        System.out.println("Vibrating.......");
    }
}
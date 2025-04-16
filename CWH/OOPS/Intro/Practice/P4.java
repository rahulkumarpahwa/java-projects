package CWH.OOPS.Intro.Practice;

public class P4 {
    public static void main(String[] args) {
        TommyVecetti game1 = new TommyVecetti();
        game1.Firing();
        game1.Hitting();
        game1.Running();
    }
}

class TommyVecetti{
    public void Hitting(){
        System.out.println("Hitting");
    }

    public void Running(){
        System.out.println("Running");
    }

    public void Firing(){
        System.out.println("Firing");
    }
}



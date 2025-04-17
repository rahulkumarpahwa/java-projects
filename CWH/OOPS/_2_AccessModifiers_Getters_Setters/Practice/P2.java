package CWH.OOPS._2_AccessModifiers_Getters_Setters.Practice;

public class P2 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(2,3);
        r1.PrintDetails();
    }
}

class Rectangle{
    int x;
    int y;

    Rectangle(){
        x = 4;
        y = 5;
    }
    Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    void PrintDetails(){
        System.out.println("Length of Rectangle " + x);
        System.out.println("Breath of Rectangle " + y);
    }
}
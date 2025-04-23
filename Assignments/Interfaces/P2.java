import java.text.DecimalFormat;

public class P2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.000");
        Circle c = new Circle();
        System.out.println("The area of the circle is " + df.format(c.area(2)));
    }
}

package CWH.OOPS._2_AccessModifiers_Getters_Setters.Practice;

public class P1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRad( 4);
        c1.setHeight(4);
        System.out.println("Cylinder c1 's : Height-> " +  c1.getHeight() + " Radius-> " + c1.getRad());
        System.out.println("Surface Area : " + c1.surfaceArea());
        System.out.println("Volume : " + c1.volume());

        Cylinder c2 = new Cylinder(4 ,2);
        System.out.println("Cylinder c2 's : Height-> " +  c2.getHeight() + " Radius-> " + c2.getRad());
        System.out.println("Surface Area : " + c2.surfaceArea());
        System.out.println("Volume : " + c2.volume());

    }
}

class Cylinder{
    private int rad;
    private int height;


    Cylinder(){
        rad = 0;
        height = 0;
    }

    Cylinder(int rad, int height){
        this.rad = rad;
        this.height = height;
    }


    void setRad(int rad){
        this.rad = rad;
    }

    void setHeight(int height){
        this.height = height;
    }

    int getRad(){
        return rad;
    }

    int getHeight(){
        return this.height;
    }

    int surfaceArea(){
        return (int) Math.PI * 2 * getRad() * getHeight();
    }
    int volume(){
        return (int) Math.PI * getRad() * getRad() * height;
    }
}
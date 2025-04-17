package CWH.OOPS._2_AccessModifiers_Getters_Setters.Practice;

import java.text.DecimalFormat;

public class P3 {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.setRad(3);
        DecimalFormat df = new DecimalFormat("00.000");
        System.out.println(df.format(s1.getVolume()));

    }
}

class Sphere {
    int rad;

    Sphere() {
        rad = 0;
    }

    Sphere(int rad) {
        this.rad = rad;
    }

    int getRad() {
        return this.rad;
    }

    void setRad(int rad) {
        this.rad = rad;
    }

    double getVolume() {
        return (4 / 3) * Math.PI * getRad() * getRad() * getRad();
    }
}

package CWH.Package;

public class C1 {
    public int x = 23;
    protected int y = 55;
    int z = 60;
    private int a = 70;

    public void print(){ // In the same class all the access modifiers are accessible.
        System.out.println(this.x);        
        System.out.println(this.y);        
        System.out.println(this.z);
        System.out.println(this.a);
    }
}

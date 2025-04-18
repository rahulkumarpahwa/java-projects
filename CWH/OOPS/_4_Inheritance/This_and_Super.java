package CWH.OOPS._4_Inheritance;


public class This_and_Super {
 public static void main(String[] args) {
    Student s = new Student(23);
    System.out.println(s.getA());

    Kid k = new Kid(56);
    System.out.println(k.getA());
 }   
}


class Student{
    int a; 
    Student(int x){
        this.a = x;
    }
    int getA(){
        return this.a;
    }
}

class Kid extends Student{
    Kid(int x){
        super(x);
        System.out.println("This is the Sub class");
    
    }
}
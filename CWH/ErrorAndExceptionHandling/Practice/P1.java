package CWH.ErrorAndExceptionHandling.Practice;

public class P1 {
    public static void main(String[] args) {
        // syntax  error: 
        // int a = 20
        // b = 34;


        //logical error:
        for(int i = 0; i <10; i++){
            if(i % 2 !=0){ // logical error printing the no. divisivble by 2
                System.out.println( "i : " + i);
            }
        }

        // runtime error: 
        System.out.println(2/0);// runtime error
    }
}

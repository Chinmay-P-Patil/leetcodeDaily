import java.util.*;

public class leet509 {
    //a 2ndlast term
    //b last term

    public static void fibonachi(int a,int b,int n){
        if(n == -1){
            System.out.println(b);           
            return;
        }
        int c= a+b;
        //System.out.println(c);
        fibonachi(b, c, n-1);
        
    }
    public static void main(String[] args){
        int a =0,b=1;
        //System.out.println(a);
        //System.out.println(b);

        int n= 4;

        fibonachi(a,b,n-2);
    }
}

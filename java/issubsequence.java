import java.util.*;

public class issubsequence {
    public static void main(String[] args){
        String s ="acb", t="ahbgdc";

        int count =0;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        
            for(int i =0;i<a.length;i++){
                for(int j = 0; j<b.length;j++){
                    if(b[j] == a[i]){
                        count++;
                    }
                }
            }
        if(count == a.length){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

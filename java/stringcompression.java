import java.util.*;

public class stringcompression {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c'};

        ArrayList<Character> a = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = 0,i=0,j=1;

        while(j<chars.length){

            if(chars[i] == chars[j]){
                n++;
                j++;
            }else{
                a.add();
                j++;
                i++;
                n=0;
            }
            
        }

        System.out.println(chars);

    }
}

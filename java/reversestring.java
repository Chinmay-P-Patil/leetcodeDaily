import java.util.*;
public class reversestring {
    public static void main(String[] args){
        String s = " a good   example ";

        

        ArrayList<String> substrings = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        String op  = String.join(" ", substrings.reversed());
        System.out.println(op);
                
        
    } 
}

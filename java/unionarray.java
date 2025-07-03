import java.util.*;

public class unionarray {
    public static void main(String[] args){
        int[] arr1 = {7,3,9}, arr2 = {6,3,9,2,9,4};
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}

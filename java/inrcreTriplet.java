import java.util.*;

public class inrcreTriplet {
    public static void main(String[] args){
        int[] nums = {21,5,0,4,1,3};
       
        //Time limit


        // int i=0,j,k;

        // while(i<nums.length-2){
        //     j = i+1;
        //     while(j<nums.length-1){
        //         k = j+1;
        //         while(k<nums.length){
        //             if(nums[i] < nums[j] && nums[j] < nums[k]){
        //                 System.out.println("true");
        //             }
        //             k++;
        //         }
        //         j++;
        //     }
        //     i++;
        // }

        long first = Long.MAX_VALUE; 
        long second = Long.MAX_VALUE; 

        
        
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num; 
            } else {
                System.out.println("true"); 
            }
        }
        

        System.out.println("kaka");
    }
}

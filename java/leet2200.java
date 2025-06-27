import java.util.*;

public class leet2200 {
    public static void main(String[] args){
        int[] nums = {2,2,2,2,2};
        int key=2,k=2;

        ArrayList<Integer> indexarr = new ArrayList<>();

        ArrayList<Integer> keyindex = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == key){
                keyindex.add(i);
            }
        }
        
        // for(int i = 0;i<keyindex.size();i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(Math.abs(j - keyindex.get(i)) <= k){
        //             indexarr.add(j);
                    
        //         }
        //     }
        // }

        int i = 0 , j = 0;
        while(i<nums.length){
            if(j>=keyindex.size()){
                j = 0;
                i++;
            }
            if(Math.abs(i - keyindex.get(j)) <=k){
                indexarr.add(i);
                i++;
                j=0;
            }else{
                j++;
            }


        }
       

       



        System.err.println(keyindex);
        System.err.println(indexarr);
    }
    
}

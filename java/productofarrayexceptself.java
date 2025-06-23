import java.util.*;

public class productofarrayexceptself {
    public static void main(String[] args){
        int[] nums = {0,2,3,4};

        int[] ans = new int[nums.length];
        int n ;
        int n2=nums[0];
        int nz = 0;
        if(nums[0] !=0){
            n = nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i] != 0){
                    n = n*nums[i];
                }else{
                    nz++;
                }
                n2=n2*nums[i];
            }

        }else{
            n=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    n = n*nums[i];
                }else{
                    nz++;
                }
                n2=n2*nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nz > 1){
                ans[i]=0;
            }else{
                if(nums[i] == 0){
                    ans[i]=n;
                }else{
                    ans[i]= n2/nums[i];
                }
            }  
        }

        System.out.println(nz);
        System.out.println(Arrays.toString(ans));
    }
}

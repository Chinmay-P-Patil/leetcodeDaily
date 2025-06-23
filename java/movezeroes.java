import java.util.ArrayList;
import java.util.Arrays;

public class movezeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};

        ArrayList<Integer> op = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            op.add(i,nums[i]);
        }

        for(int i=0;i<op.size();i++){
            if(op.get(i) == 0){
                op.remove(i);
                op.add(0);
            }
        }
        
        int[] array = op.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(array).forEach(num -> System.out.print(num + " "));
        System.out.println(op);
        
    }
}

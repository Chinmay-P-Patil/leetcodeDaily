import java.lang.reflect.Array;
import java.util.ArrayList;

public class leet46 {
    public static void permutations(ArrayList<Integer> nums, ArrayList<Integer> perm, ArrayList<ArrayList<Integer>> result, int index) {
        if (nums.isEmpty()) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            int currNum = nums.get(i);
            ArrayList<Integer> newNums = new ArrayList<>(nums);
            newNums.remove(i);
            perm.add(currNum);
            permutations(newNums, perm, result, index + 1);
            perm.remove(perm.size() - 1);
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        permutations(numList, new ArrayList<>(), result, 0);
    }
}

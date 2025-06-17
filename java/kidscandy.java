import java.util.Arrays;

public class kidscandy {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extracandies = 3;

        boolean[] op = new boolean[candies.length];
        int g = 0;
        for (int i = 0; i < candies.length; i++) {
            if (g < candies[i]) {
                g = candies[i];
            }
        }
        System.out.println(g);

        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extracandies >= g){
                op[i] = true;
            }else{
                op[i] = false;
            }
        }

        System.out.println(Arrays.toString(op));

    }
}

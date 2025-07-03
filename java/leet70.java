public class leet70 {
    public static void main(String[] args){
        int n =5;

        
        int n1 = 1, n2 = 1;

        for (int i = 0; i < n; i++) {

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n1);
    }
}

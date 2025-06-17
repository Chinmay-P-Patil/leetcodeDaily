import java.util.*;

public class GCDofStr {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        char[] a1 = str1.toCharArray(), a2 = str2.toCharArray(), op;
        int l1 = a1.length, l2 = a2.length;

        if ((str1 + str2).equals(str2 + str1)) {
            int gcdLength = gcd(l1, l2);
            op = new char[gcdLength];
            for (int i = 0; i < gcdLength; i++) {
                op[i] = a1[i];
            }
        } else {
            op = new char[0];
        }

        System.out.println(new String(op)); 
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

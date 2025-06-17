import java.util.*;

public class vowals {
    public static void main(String[] args) {
        String s = "IceCreAm";

        char[] a = s.toCharArray();
        char[] v = { 'a', 'e', 'i', 'o', 'u' };
        char[] v2 = { 'A', 'E', 'I', 'O', 'U' };
        ArrayList<Integer> v3 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (a[i] == v[j] || a[i] == v2[j]) {
                    v3.add(i);
                }
            }
        }
        int left = 0;
        int right = v3.size() - 1;
        while (left < right) {
            char temp = a[v3.get(left)];
            a[v3.get(left)] = a[v3.get(right)];
            a[v3.get(right)] = temp;
            left++;
            right--;
        }
        System.out.println(v3.size());
        System.out.println(a);

    }

}

import java.util.*;

public class leet118 {
    public static void main(String[] args){
        int n =5;

        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        ArrayList<Integer> prevlist = new ArrayList<>();
        ArrayList<Integer> nextlist = new ArrayList<>();
        prevlist.add(1);
        list.add(new ArrayList<>(prevlist));
        prevlist.clear();
        prevlist.add(1);
        prevlist.add(1);
        list.add(new ArrayList<>(prevlist));

        for(int x =3;x<=n;x++){
            nextlist = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                nextlist.add(0);
            }
            System.out.println(nextlist);
            int i = 0,j=x-1,k=0,l=1; 
            nextlist.set(i, 1);
            nextlist.set(j,1);
            i++;
            j--;
            while(i<=j && l<prevlist.size()){
                nextlist.set(i,prevlist.get(k) + prevlist.get(l));
                i++;
                k++;l++;

            }
            list.add(new ArrayList<>(nextlist));
            prevlist = new ArrayList<>(nextlist);
        }




        System.out.println(list);

    }
}

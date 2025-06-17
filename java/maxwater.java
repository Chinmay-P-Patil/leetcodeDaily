import java.util.*;

public class maxwater{
    public static void main (String[] args){
        int[] h = {1,0,0,0,0,0,0,2,2};
        int area = 0;
        for(int i=0;i<h.length;i++){
            for(int j=i+1; j<h.length; j++){
                if(h[i] < h[j]){
                    if(area < (h[i] * (j-i))){
                        area = (h[i] * (j-i));
                    }
                }else if(h[i] > h[j]){
                    if(area < (h[j] * (j-i))){
                        area = (h[j] * (j-i));
                    }
                }else if(h[i] == h[j]){
                    if(area < (h[j] * (j-i))){
                        area = (h[j] * (j-i));
                    }
                }
            }
        }
        System.out.println(area);

    }
}
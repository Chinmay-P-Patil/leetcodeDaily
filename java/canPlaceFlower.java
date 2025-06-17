public class canPlaceFlower {
    public static void main(String[] args) {
        int[] flowebed = {1,0,1,0,1,0,1};// 0 1 0 1 0
        int n = 1;


            if(flowebed[0] == 0 && flowebed[1] ==0){
                n--;
                flowebed[0] = 1;
            }else if(flowebed[flowebed.length-1] == 0 && flowebed[flowebed.length-2] ==0){
                n--;
                flowebed[flowebed.length-1]=1;
            }
    
            for(int i=1;i<flowebed.length-1;i++){
                if(flowebed[i-1] ==0 && flowebed[i+1]==0 && flowebed[i]==0){
                    n--;
                    flowebed[i]=1;
                }
            }
            if(n==0 || n<0){
                System.out.println(true);
            }else{System.out.println(false);}
        
        
        // int c = 0;
        // if (flowebed[0] == 0) {
        //     for(int i=0; i<flowebed.length; i++){
        //         if((i+1) % 2 ==0 && flowebed[i] == 0){
        //             c++;
        //         }
        //     }
        // }else{
        //     for(int i=0; i<flowebed.length; i++){
        //         if((i+1) % 2 !=0 && flowebed[i] == 0){
        //             c++;
        //         }
        //     }
        // }

        // if( c == n){
        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }
    }

}

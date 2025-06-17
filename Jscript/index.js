nums = [1,2,4,5,10,3]
var tupleSameProduct = function(nums) {
    let productarr = []
    let n=0;
    let count = 0;
    for(i=0;i<nums.length;i++){
        for(j=i+1;j<nums.length;j++){
                productarr[n]=nums[i]*nums[j];
                n++;
        }
    }
    for(i=0;i<productarr.length;i++){
        for(j=0;j<productarr.length;j++){
            if(j != i){
                if(productarr[i] === productarr[j]){
                    count++;
                }
            }
            
        }
    }
    return 4*count 
};
console.log(tupleSameProduct(nums))



var twoSum = function(nums, target) {
    for(i=0; i<nums.length; i++){
        let num = target - nums[i];
        for(j=i+1; j<nums.length; j++){
            if(num === nums[j]){
                return[i,j]
            }
        }
    }
};
let ans = twoSum([2,7,11,15],9)
console.log(ans)
var divideArray = function(nums) {
    let newnums = new Map();
    for(i=0; i<nums.length; i++){
        newnums.set(nums[i],i);
    }
    console.log(newnums)
    
};

divideArray([3,2,3,2,2,2])
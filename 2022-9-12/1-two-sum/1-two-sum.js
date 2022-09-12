var twoSum = function(nums, target) {
    var numsObject = {};
    var length=nums.length;
    var i;
    for (i = 0; i < length; i++) {
        if(numsObject[target-nums[i]]!==undefined){
            return [numsObject[target-nums[i]],i];
        }
        numsObject[nums[i]]=i;
    }
}
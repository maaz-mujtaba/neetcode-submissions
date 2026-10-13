class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(nums,target,0,0);
    }
    int fun(int[]nums, int target, int sum, int i){
        if(i == nums.length){
            return (sum == target)?1:0;
        }
        return fun(nums,target,sum+nums[i],i+1)+
        fun(nums,target,sum-nums[i],i+1);
    }
}

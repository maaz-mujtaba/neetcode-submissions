class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int res = 0;
        return fun(nums,target,0,0)
    }
    int fun(int[]nums, int target, int sum, int iter){
        if(iter == nums.length){
            return target == sum ? 1 : 0;
        }
        return fun(nums,target, sum + nums[iter],iter+1) + 
        fun(nums,target,sum-nums[iter], iter+1);
    }
}

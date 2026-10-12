class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int res = 0;
        fun(nums,target,0,res);
        return res;
    }
    int fun(int[]nums, int target, int sum, int iter){
        if(iter == nums.length){
            return 1;
        }
        return fun(nums,target, sum + nums[iter],iter+1) + 
        fun(nums,target,sum-nums[iter], iter+1);
    }
}

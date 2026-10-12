class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int res = 0;
        fun(nums,target,0,res);
        return res;
    }
    void fun(int[]nums, int target, int sum, int iter){
        if(sum == target){
            return;
        }

        for(int i = iter; i<nums.length; i++){

            if(sum < target)
            fun(nums,target,sum + nums[i],iter+1);

            if(sum > target)
            fun(nums, target,sum - nums[i],iter+1);
        }
    }
}

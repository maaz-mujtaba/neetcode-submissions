class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int num : nums) sum += num;

        if(sum % 2 != 0) return false;

        int target = (int)sum/2;

        boolean[] dp = new boolean[target+1];

        dp[0] = true;

        for(int num : nums){
            for(int j = target; j>=num; j--){
                dp[j] = dp[j] || dp[j-num];
            }
        }
        return dp[target];
    }
}

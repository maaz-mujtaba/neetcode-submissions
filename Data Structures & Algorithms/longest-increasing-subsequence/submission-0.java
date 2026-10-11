class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        int right = 1;
        if(n == right) return right;

        while(right < n){
            int left = 0;
            while(left < right){
                if(nums[left] < nums[right]){
                    dp[right] = Math.max(dp[right], dp[left]+1);
                }
                left++;
            }
            right++;
        }

        int res = dp[0];
        for(int num : dp) res = Math.max(res,num);

        return res;
    }
}

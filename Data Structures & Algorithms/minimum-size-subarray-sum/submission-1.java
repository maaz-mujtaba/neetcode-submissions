class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int size = Integer.MAX_VALUE;;
        int l = 0;
        int r = 0;
        int n = nums.length;

        while(r < n)
        {
            sum += nums[r];

            while(sum >= target){
                size = Math.min(r-l+1,size);
                sum-=nums[l];
                l++;
            }

            r++;
        }
        return size==Integer.MAX_VALUE?0:size;
    }
}
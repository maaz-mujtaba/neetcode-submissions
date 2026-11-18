class Solution {
    public int maxProduct(int[] nums) {
        int maxHere = nums[0];
        int minHere = nums[0];
        int res = nums[0];

        for(int i = 1; i<nums.length; i++){
            int cMax = Math.max(nums[i], Math.max(maxHere * nums[i], minHere*nums[i]));

            int cMin = Math.min(nums[i], Math.min(maxHere * nums[i], minHere*nums[i]));

            maxHere = cMax;
            minHere = cMin;

            res = Math.max(res, maxHere);
        }
        return res;
    }
}

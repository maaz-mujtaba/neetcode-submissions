class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int seq = 0;
        int max = 0;

        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                seq++;
                max = Math.max(seq,max);
            }
            else seq = 0;
        }
        return max;
    }
}
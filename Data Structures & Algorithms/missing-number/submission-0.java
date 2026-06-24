class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int nXOR = 0;


        for(int i = 0; i<=n;i++)
        {
            nXOR ^= i;
        }

        for(int num : nums)
        {
            nXOR ^= num;
        }
        return nXOR;
    }
}

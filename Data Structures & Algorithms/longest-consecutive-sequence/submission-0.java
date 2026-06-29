class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int maxLen = 0;


        for(int num : nums)
        {
            set.add(num);
        }

        for(int i = 0; i<nums.length; i++)
        {
            int len = 0;
            int sub = nums[i];
            while(set.contains(sub)){
                len++;
                sub++;
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}

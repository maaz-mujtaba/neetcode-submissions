class Solution {
    public int firstMissingPositive(int[] nums) {
        int max  = Integer.MIN_VALUE;

        for(int num : nums) max = Math.max(num,max);

        HashSet <Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        for(int i = 1; i<=max;i++)
        {
            if(!set.contains(i))
            return i;
        }
        return max < 0?1:max+1;
    }
}
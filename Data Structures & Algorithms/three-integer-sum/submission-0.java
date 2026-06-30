class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(i > 0 && nums[i]==nums[i-1]) continue;


            int l = i + 1;
            int r = nums.length-1;

            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0)
                l++;

                else if(sum > 0) r--;
                else {
                    list.add(Arrays.asList(nums[i],nums[r],nums[l]));
                    l++;
                    while(nums[l] == nums[l-1] && l < r) l++;
                }
            }
        }
        return list;
    }
}

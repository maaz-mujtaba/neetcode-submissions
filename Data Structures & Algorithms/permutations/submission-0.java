class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> list = new ArrayList<>();
        help(0,nums,list);
        return list;
    }
    void help(int index, int[]nums, List<List<Integer>> list)
    {
        if(index == nums.length)
        {
            List <Integer> arr = new ArrayList<>();
            for(int i = 0; i<nums.length; i++)
            {
                arr.add(nums[i]);
            }
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i = index; i<nums.length; i++)
        {
            swap(i,index,nums);
            help(index+1,nums,list);
            swap(i,index,nums);
        }
    }
    void swap(int r, int l, int[]nums)
    {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}

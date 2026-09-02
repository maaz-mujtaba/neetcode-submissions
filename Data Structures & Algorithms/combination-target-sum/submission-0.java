class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();
        help(0,nums,target,0,new ArrayList<>(),list);
        return list;
    }
    void help(int index,int[]nums, int target, int total,List<Integer> arr, List<List<Integer>>list)
    {
        if(total == target)
        {
            list.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index; i<nums.length;i++)
        {
            if(nums[i] + total > target) return;

            arr.add(nums[i]);
            help(i,nums,target,total+nums[i],arr,list);
            arr.remove(arr.size()-1);
        }
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> arr = new ArrayList<>();
        int index = 0;
        help(0,nums,arr,list);
        return list;
    }
    void help(int index, int[] nums, List<Integer> arr, List<List<Integer>>list)
    {
        if(index == nums.length)
        {
            list.add(new ArrayList<>(arr));
            return;
        }

        help(index+1,nums,arr,list);
        arr.add(nums[index]);

        help(index+1,nums,arr,list);
        arr.remove(arr.size()-1);
    }
}

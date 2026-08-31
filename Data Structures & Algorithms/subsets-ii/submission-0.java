class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> arr =  new ArrayList<>();
        help(0,nums,arr,list);
        return list;
    }
    void help(int index,int[]nums, List<Integer> arr, List<List<Integer>>list)
    {
        list.add(new ArrayList<>(arr));
        for(int i = index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1]) continue;
            arr.add(nums[i]);
            help(i+1,nums,arr,list);
            arr.remove(arr.size()-1);
        }
    }
}

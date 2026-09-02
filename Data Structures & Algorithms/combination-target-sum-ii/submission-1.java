class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List <Integer> arr = new ArrayList<>();
        List <List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        help(0,candidates,target,0,arr,list);
        return list;
    }
    void help(int index,int[]nums,int target,int total, List<Integer> arr, List<List<Integer>> list)
    {
        if(total == target)
        {
            list.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index; i<nums.length;i++)
        {
            if(i > index && nums[i]==nums[i-1]) continue;
            if(total + nums[i] > target) break;
            arr.add(nums[i]);
            help(i+1,nums,target,total+nums[i],arr,list);
            arr.remove(arr.size()-1);
        }
    }
}

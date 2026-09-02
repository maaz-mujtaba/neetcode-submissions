class Solution {
    public int subsetXORSum(int[] nums) {
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> arr = new ArrayList<>();
        int[] result ={0,1};
        help(0,nums,0,result,arr);
        return result[0];
    }
    void help(int index,int[]nums, int xor,int[] result,List<Integer> arr)
    {
        result[0] += xor;
        for(int i = index; i<nums.length; i++)
        {
            arr.add(nums[i]);
            help(i+1,nums,xor^nums[i],result,arr);
            arr.remove(arr.size()-1);
        }
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        List <Integer> list = new ArrayList<>();
        int freq = 0;
        for(int num : nums)
        {
            if(num != val) list.add(num);
        }
        int k = list.size();
        for(int i = 0; i<k;i++)
        {
            nums[i] = list.get(i);
        }
        return k;
    }
}
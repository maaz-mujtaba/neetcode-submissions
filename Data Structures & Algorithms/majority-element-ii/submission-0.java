class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        int n = nums.length;
        int k = n/3;

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry <Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int freq = entry.getValue();

            if(freq > k) list.add(key);
        }
        return list;
    }
}
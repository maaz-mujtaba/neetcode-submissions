class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int maxElement = 0;
        for(Map.Entry <Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq)
            {
                maxFreq = freq;
                maxElement = key;
            }
        }
        return maxElement;
    }
}
class Solution {
    public int maxDifference(String s) {
        HashMap <Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int evenMax = 0;
        int oddMax = 0;
        for(Integer val : map.values()){
            if(val % 2 == 0 && val > evenMax) evenMax = val;

            else if(val % 2 != 0 && val > oddMax) oddMax = val;
        }

        return oddMax - evenMax;
    }
}
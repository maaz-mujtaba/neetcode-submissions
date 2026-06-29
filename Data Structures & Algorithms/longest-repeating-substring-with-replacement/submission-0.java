class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        HashMap <Character,Integer> map = new HashMap<>();


        while(r < n)
        {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            while((r - l + 1)-maxFreq > k)
            {
                char left = s.charAt(l);
                map.put(left, map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}

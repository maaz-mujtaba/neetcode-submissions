class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        HashMap <Character,Integer> map = new HashMap<>();
        int ans = 0;

        while(r < n)
        {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c,0)+1);

            while(map.get(c) > 1)
            {
                char left = s.charAt(l);
                map.put(left, map.get(left)-1);
                if(map.getOrDefault(left,0)==0) map.remove(left);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}

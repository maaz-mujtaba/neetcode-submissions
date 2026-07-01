class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();
        for(char c : s1.toCharArray())
        {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        int k = s1.length();
        int l = 0;
        int r = 0;
        int n = s2.length();

        while(r < n)
        {
            map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r),0)+1);

            if((r - l + 1)>k)
            {
                char left = s2.charAt(l);
                map2.put(left, map2.get(left)-1);
                if(map2.get(left)==0) map2.remove(left);
                l++;
            }
            if(map1.equals(map2)) return true;
            r++;
        }
        return false;
    }
}

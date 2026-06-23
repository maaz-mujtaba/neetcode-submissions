class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;

        int l = 0;
        int r = heights.length-1;

        while(l < r)
        {
            int current = (r - l) * Math.min(heights[l],heights[r]);

            ans = Math.max(ans,current);

            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return ans;
    }
}

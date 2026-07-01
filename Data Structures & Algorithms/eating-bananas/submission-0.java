class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max  = piles[0];

        for(int pile : piles)
        {
            max = Math.max(pile,max);
        }

        int l = 1;
        int r = max;
        int maxSpeed = max;

        while(l <= r)
        {
            int mid = l + (r - l)/2;
            long hours = 0;
            for(int i = 0; i<piles.length; i++)
            {
                hours += Math.ceil((double)piles[i]/mid);
            }
            if(hours <= h){
                maxSpeed = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return maxSpeed;
    }
}

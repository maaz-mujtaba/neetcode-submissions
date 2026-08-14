class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int l = 0;
        int r = people.length-1;

        while(l<=r)
        {
            int rem = limit - people[r];
            r--;
            boats++;
            if(l <= r && rem >= people[l])
            {
                l++;
            }
        }
        return boats;
    }
}
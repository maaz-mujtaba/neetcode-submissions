class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas) < sum(cost)) return -1;
        
        int n = gas.length;

        int total = 0;
        int res = 0;

        for(int i = 0; i<n; i++)
        {
            total += gas[i] - cost[i];

            if (total < 0)
            {
                total = 0;
                res = i + 1;
            }
        }
        return res;
    }

    int sum(int nums[])
    {
        int s = 0;
        for(int num : nums) s += num;

        return s;
    }
}

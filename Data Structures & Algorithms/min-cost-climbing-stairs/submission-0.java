class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i = cost.length-3; i>=0;i--)
        {
            cost[i] += Math.min(cost[i+2],cost[i+1]);
        }
        return Math.min(cost[0],cost[1]);
    }
}

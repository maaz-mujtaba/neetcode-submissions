class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int res = 0;

        for(List<Integer> arr : triangle){
            int curr = Integer.MAX_VALUE;
            for(Integer val : arr){
                curr = Math.min(val,curr);
            }
            res += curr;
        }
        return res;
    }
}
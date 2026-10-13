class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int res = 0;

        for(List<Integer> arr : triangle){
            int curr = Integer.MAX_VALUE;
            for(Integer val : arr){
                //if(val > 0)
                curr = Math.min(val,curr);
            }
            //if(curr != Integer.MAX_VALUE)
            res += curr;
        }
        return (res != Integer.MAX_VALUE)?res : -1;
    }
}
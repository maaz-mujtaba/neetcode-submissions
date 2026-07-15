class Solution {
    public int searchInsert(int[] nums, int target) {
        int wouldHaveBeen = 0;
        int l = 0;
        int r = nums.length-1;

        while(l <= r)
        {
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                wouldHaveBeen = mid + 1;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return wouldHaveBeen;
    }
}
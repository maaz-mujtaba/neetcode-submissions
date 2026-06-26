class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l <= r)
        {
            int mid = l + (r-l)/2;

            if(nums[mid] ==target) return mid;

            if(nums[l] < nums[mid]){
                if(nums[mid] >= target && nums[l] < nums[mid]) l = mid + 1;
                else r = mid - 1;
            }
            else{
                if(nums[mid] < target && nums[r] < nums[mid]) r = mid + 1;
                else r = mid -1;
            }
        }
        return -1;
    }
}

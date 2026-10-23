class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        int index = -1;

        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        index = i;

        if(index >= 0){
            int j = n-1;
            while(nums[j] <= nums[index]) j--;

            swap(nums,j,index);
        }

        int l = index + 1;
        int r = n-1;

        while(l < r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    void swap(int[]nums,int l, int r){
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }
}
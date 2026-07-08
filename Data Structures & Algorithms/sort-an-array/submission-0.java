class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[]nums,int left,int right)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    void merge(int[] nums, int left, int mid, int right)
    {
        int i = left;
        int j = mid + 1;
        List <Integer> list = new ArrayList<>();

        while(i <= mid && j <= right)
        {
            if(nums[i] <= nums[j])
            {
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            }
        }

        while(i <= mid)
        {
            list.add(nums[i]);
            i++;
        }
        while(j <= right)
        {
            list.add(nums[j]);
            j++;
        }

        for(i = left; i<=right;i++)
        {
            nums[i] = list.get(i-left);
        }
    }
}
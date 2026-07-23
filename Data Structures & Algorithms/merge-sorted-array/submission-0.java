class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j<n)
        {
            if(nums1[i] <= nums2[j])
            {
                output[k] = nums1[i];
                i++;
                k++;
            }
            else{
                output[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m)
        {
           output[k]  = nums1[i];
           i++;
           k++;
        }

        while(j < n)
        {
            output[k] = nums2[j];
            j++;
            k++;
        }
        for(int q = 0; q<(m + n);q++)
        {
            nums1[q] = output[q];
        }
    }
}
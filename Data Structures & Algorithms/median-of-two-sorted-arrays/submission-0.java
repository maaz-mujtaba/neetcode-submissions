class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] input = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j])
            input[k++] = nums1[i++];
            else input[k++] = nums2[j++];
        }

        while(i < nums1.length) input[k++] = nums1[i++];

        while(j < nums2.length) input[k++] = nums2[j++];

        int mid = k / 2;

        if(input.length % 2 == 0){
            int n = input.length;
            int num1 = input[n/2];
            int num2 = input[(n-1)/2];
            return (num1+num2)/2.0;
        }
        else{
            return (double)input[input.length/2];
        }
    }
}

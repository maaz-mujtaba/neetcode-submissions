class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        output[0] = -1;
        output[1] = -1;

        int l = 0;
        int r = numbers.length-1;

        while(l < r)
        {
            if(numbers[l] + numbers[r] == target)
            {
                output[0] = l+1;
                output[1] = r + 1;
                return output;
            }

            if(numbers[l] + numbers[r] > target)
            {
                r--;
            }
            else l++;
        }
        return output;
    }
}

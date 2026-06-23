class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int n = matrix[0].length;
        int r = matrix.length * n -1;

        while(l <= r)
        {
            int mid = (l + r)/2;
            int midVal = matrix[mid/n][mid%n];

            if(midVal==target) return true;

            else if(midVal > target) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}

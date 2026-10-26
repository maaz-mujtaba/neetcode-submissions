class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = m - 1;
        ArrayList <Integer> list = new ArrayList<>();

        while(left <= right && top <= bottom){
            //left to right
            for(int col = left; col <= right; col++){
                list.add(matrix[top][col]);
            }
            top++;

            //top to bottom
            for(int row = top; row <= bottom; row++){
                list.add(matrix[row][right]);
            }
            right--;

            //right to left;
            if(top <= bottom){
                for(int col = right; col >= left; col--){
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            //bottom to top
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }
        return list;
    }
}

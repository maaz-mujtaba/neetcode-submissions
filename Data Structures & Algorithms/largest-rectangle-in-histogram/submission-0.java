class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <int[]> stack = new Stack<>();
        int maxArea = 0;

        int i = 0;
        int h = 0;

        for(i = 0; i<heights.length;i++)
        {
            int start = i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i])
            {
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];
                int area = height * (i-index);
                maxArea = Math.max(area,maxArea);
                start = index;
            }
            
            stack.push(new int[]{start,heights[i]});
        }

        for(int[]top : stack)
        {
            int index = top[0];
            int height = top[1];
            int area = height * (heights.length-index);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}

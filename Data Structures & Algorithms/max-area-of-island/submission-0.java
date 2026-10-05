class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                maxArea = Math.max(maxArea, dfs(grid,i,j));
            }
        }
        return maxArea;
    }
    int dfs(int[][]grid,int r, int c){
        if(r < 0 || r>=grid.length || c < 0 || c>=grid[0].length || grid[r][c]==0)
        return 0;

        int area = grid[r][c];
        grid[r][c] = 0;
        area += dfs(grid,r-1,c);
        area += dfs(grid,r+1,c);
        area += dfs(grid,r,c-1);
        area += dfs(grid,r,c+1);
        return area;
    }
}

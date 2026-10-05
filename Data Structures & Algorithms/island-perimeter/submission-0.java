class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j]!=0){
                    return dfs(grid,i,j);
                }
            }
        }
        return 0;
    }
    int dfs(int[][]grid, int r, int c){
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c]==0)
        return 1;

        if(grid[r][c]==-1) return 0;

        int dim = 0;

        grid[r][c] = -1;
        dim += dfs(grid,r-1,c);
        dim += dfs(grid,r+1,c);
        dim += dfs(grid,r,c+1);
        dim += dfs(grid,r,c-1);
        return dim;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        int[][] array = {
            {-1,-1} ,{-1,0} ,{-1,1},
            {1,-1},           {0,1},
            {0,-1},{1,0}, {1,1}
        };

        Queue <int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        grid[0][0] = 1;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int d = curr[2];

            if(r == n-1 && c == n-1) return d;

            for(int[] dist : array){
                int nR = r + dist[0];
                int nC = c + dist[1];
                int nD = d + 1;

                if(nR >= 0 && nR < n
                && nC >= 0 && nC < n
                && grid[nR][nC]==0){
                    grid[nR][nC] = 1;
                    q.offer(new int[]{nR,nC,nD});
                }
            }
        }
        return -1;
    }
}
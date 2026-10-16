class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = -1;
        Queue <Pair<Integer,Integer>> q = new LinkedList<>();

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == 1) fresh++;
                if(grid[i][j] == 2){
                    q.offer(new Pair<>(i,j));
                }
            }
        }

        q.offer(new Pair<>(-1,-1));

        while(!q.isEmpty()){
            Pair <Integer,Integer> pair = q.poll();
            int r = pair.getKey();
            int c = pair.getValue();

            if(r == -1 && c == -1){
                time++;
                if(!q.isEmpty()) q.offer(new Pair<>(-1,-1));
            }
            else{
            if(r-1 >= 0 && grid[r-1][c]==1){
                grid[r-1][c] = 2;
                fresh--;
                q.offer(new Pair<>(r-1,c));
            }
            if(r+1 < grid.length && grid[r+1][c]==1){
                grid[r+1][c] = 2;
                fresh--;
                q.offer(new Pair<>(r+1,c));
            }
            if(c-1 >= 0 && grid[r][c-1]==1){
                grid[r][c-1] = 2;
                fresh--;
                q.offer(new Pair<>(r,c-1));
            }
            if(c+1 < grid[0].length && grid[r][c+1]==1){
                grid[r][c+1] = 2;
                fresh--;
                q.offer(new Pair<>(r,c+1));
            }}
        }
        //System.out.println(fresh + "    " + time);
        return (fresh == 0)?time : -1;
    }
}
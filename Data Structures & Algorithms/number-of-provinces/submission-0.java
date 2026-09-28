class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        int provinces = 0;

        for(int i = 0; i<n; i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                provinces++;
            }
        }
        return provinces;
    }
    void dfs(int[][]isConnected,boolean[]visited,int v){
        visited[v] = true;

        for(int i = 0; i<isConnected.length; i++){
            if(visited[i] == false && isConnected[i][v]==1){
                dfs(isConnected,visited,i);
            }
        }
    }
}
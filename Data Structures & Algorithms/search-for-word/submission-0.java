class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(dfs(board,i,j,word,0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][]board, int r, int c, String word, int i){
        if(i == word.length()) return true;

        if(r < 0 || r>= board.length || c < 0 || c >= board[0].length || 
        board[r][c] != word.charAt(i) || board[r][c]=='7') return false;

        board[r][c] = '7';

        boolean flag =  dfs(board,r-1,c,word,i+1) || dfs(board, r+1, c, word, i+1)
               || dfs(board,r,c+1,word,i+1) || dfs(board,r,c-1,word,i+1);

        board[r][c] = word.charAt(i);
        return flag; 
    }
}

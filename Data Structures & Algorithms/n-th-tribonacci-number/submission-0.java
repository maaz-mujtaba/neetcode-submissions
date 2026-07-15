class Solution {
    public int tribonacci(int n) {
        if(n<=2){
            if(n==0) return 0;
            else return 1;
        }

        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
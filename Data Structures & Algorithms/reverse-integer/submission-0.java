class Solution {
    public int reverse(int x) {
        int Max = Integer.MAX_VALUE;
        int Min = Integer.MIN_VALUE;

        int temp = x;
        int rev = 0;
        while(temp != 0)
        {
            
            int d = temp%10;
            if(rev > Max/10 || (rev==Max/10 && d >= Max%10)) return 0;
            if(rev < Min/10 || (rev==Min/10 && d <= Min%10)) return 0;

            rev = (rev*10) + d;
            temp/=10;
        }
        return rev;
    }
}

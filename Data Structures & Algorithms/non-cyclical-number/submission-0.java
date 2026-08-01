class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();

        while(!set.contains(n))
        {
            set.add(n);
            n = sumOfDigits(n);
            if (n==1) return true;
        }
        return false;
    }
    int sumOfDigits(int n)
    {
        int formed = 0;
        while(n > 0)
        {
            int d = n % 10;
            formed += Math.pow(d,2);
            n/=10;
        }
        return formed;
    }
}

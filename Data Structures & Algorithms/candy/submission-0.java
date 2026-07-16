class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] prefix = new int[n];
        Arrays.fill(prefix,1);

        //checking for first iteration
        for(int i = 1; i < n; i++)
        {
            if(ratings[i-1] < ratings[i])
            prefix[i] = prefix[i-1] +1;
        
        }

        //checking from rear
        for(int i = n-2 ; i>=0; i--)
        {
            if(ratings[i] > ratings[i+1])
            prefix[i] = Math.max(prefix[i], prefix[i+1]+1); 
        }
        int sum = 0;
        for(int num : prefix) sum += num;

        return sum;
    }
}
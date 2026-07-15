class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();

        char[] output = new char[n];
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int i = 0;
        int j = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        int index = 0;
        while(i < n1 && j<n2)
        {
            output[index++] = w1[i];
            output[index++] = w2[j];
            i++;
            j++;
        }

        while(i < n1 && index < n)
        {
            output[index++] = w1[i++];
        }

        while(j < n2 && index < n)
        {
            output[index++] = w2[j++];
        }
        return new String(output);
    }
}
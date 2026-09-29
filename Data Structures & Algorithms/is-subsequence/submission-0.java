class Solution {
    public boolean isSubsequence(String s, String t) {
        int subLength = s.length();
        int targetLength = t.length();

        int subPointer = 0;
        int targetPointer = 0;
        int counter = 0;
        while(subPointer < subLength && targetPointer < targetLength)
        {
            if(s.charAt(subPointer) == t.charAt(targetPointer))
            {
                subPointer++; 
                targetPointer++;
                counter++;
            }
            else{
                targetPointer++;
            }
        }
        return counter==s.length();
    }
}
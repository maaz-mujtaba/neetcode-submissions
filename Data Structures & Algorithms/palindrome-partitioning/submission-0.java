class Solution {
    public List<List<String>> partition(String s) {
        List <List<String>> list = new ArrayList<>();
        help(0,s,list, new ArrayList<>());
        return list;
    }
    void help(int index, String s, List<List<String>> list, List<String>arr)
    {
        if(index >= s.length())
        {
            list.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index; i<s.length(); i++)
        {
            if(isPal(s,index,i)){
            arr.add(s.substring(index,i+1));
            help(i+1,s,list,arr);
            arr.remove(arr.size()-1);
            }
        }
    }
    boolean isPal(String s,int l ,int r)
    {
        while(l < r)
        {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}

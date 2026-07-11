class Solution {

    public String encode(List<String> strs) {
        StringBuilder sub = new StringBuilder();
        
        for(String s : strs)
        {
            sub.append(s.length());
            sub.append("#");
            sub.append(s);
        }
        return sub.toString();
    }

    public List<String> decode(String str) {
        List <String> list = new ArrayList<>();
        int n = str.length();
        int i = 0;

        while(i < n)
        {
            int j = i;
            StringBuilder sub = new StringBuilder();
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            sub.append(str.substring(j+1 , j + 1 + len));
            list.add(sub.toString());
            i = j + 1 + len;
        }
        return list;
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> list = new ArrayList<>();
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.length() < 1) return list;
        dfs(digits,"",0,map,list);

        return list;
    }
    void dfs(String digits, String curr, int i, String[]map,List<String>list){
        if(digits.length() == curr.length()){
            list.add(curr);
            return;
        }

        String x = map[digits.charAt(i)-'0'];
        for(char c : x.toCharArray()){
            dfs(digits,curr+c,i+1,map,list);
        }
    }
}

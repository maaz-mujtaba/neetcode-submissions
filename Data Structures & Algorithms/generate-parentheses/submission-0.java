class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> list = new ArrayList<>();
        StringBuilder sub = new StringBuilder();
        fun(sub,n,n,list);
        return list;
    }
    void fun(StringBuilder sub, int open, int close, List<String>list){
        if(open == 0 && close == 0){
            list.add(sub.toString());
            return;
        }

        if(open > 0){
            sub.append('(');
            fun(sub, open-1,close,list);
            sub.deleteCharAt(sub.length()-1);
        }

        if(close > open){
            sub.append(')');
            fun(sub,open,close-1,list);
            sub.deleteCharAt(sub.length()-1);
        }
    }
}

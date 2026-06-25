class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();

        for(String s : tokens)
        {
            int num = 0;
            if(isNumber(s)) stack.push(Integer.parseInt(s));
            else{
                int a = stack.pop();
                int b = stack.pop();

                switch(s){
                    case "+":
                    num = a+b;
                    break;
                    case "-":
                    num = a-b;
                    break;
                    case "*":
                    num = a*b;
                    break;
                    case "/":
                    num = b/a;
                    break;
                }
                stack.push(num);
            }
        }
        return stack.peek();
    }
    boolean isNumber(String s)
    {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
}

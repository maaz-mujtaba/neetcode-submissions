class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        int prev = 0;

        for(String s : operations)
        {
            if(s.equals("+"))
            {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(s.equals("D"))
            {
                stack.push(2 * stack.peek());
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else stack.push(Integer.parseInt(s));
        }

        int sum = 0;
        for(int num : stack) sum += num;

        return sum;
    }
}
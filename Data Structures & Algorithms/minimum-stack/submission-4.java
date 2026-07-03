class MinStack {
    ListNode node;
    int min;
    public MinStack() {
        node = null;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        node = new ListNode(val,min,node);
    }
    
    public void pop() {
        node = node.next;
        if(node==null) min = Integer.MAX_VALUE;
        else min = node.currMin;
    }
    
    public int top() {
        return node.val;
    }
    
    public int getMin() {
        return node.currMin;
    }
}
class ListNode{
    int val;
    int currMin;
    ListNode next;

    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, int curr, ListNode next){
        this.val = val;
        this.currMin = curr;
        this.next = next;
    }
}

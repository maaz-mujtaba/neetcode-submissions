/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = length(head);
        int target = size - n;

        if(target == 0) return head.next;

        ListNode curr = head;

        for(int i = 0; i<target - 1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    int length(ListNode head){
        if(head == null) return 0;
        return 1 + length(head.next);
    }
}

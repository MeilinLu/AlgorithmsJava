/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.
Example:
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        // if (head != null && head.val == val) {   ??????????
        //     head = head.next;
        // }
        ListNode curr = head;
        
        while (curr != null) {
            
            if (curr.next != null && curr.next.val == val) {
                
                // ListNode temp = curr.next.next;
                // curr.next = temp;
                // OR temp is not necessary
                curr.next = curr.next.next;
                
            } else {
                curr = curr.next;
            }
        } 
        
        return (head != null && head.val == val) ? head.next : head;
        // OR 
    	// if (head.val == val) {
    	// 	return head.next;
    	// }
    	// return head;
    }
}
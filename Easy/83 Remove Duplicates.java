// For the problem at https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = head;
        ListNode curr = head;
        while(curr != null) {  // while our current pointer is not empty
            ListNode temp = curr;  // temp node for storage
            while(temp != null && temp.val == curr.val) {  // check for duplicate
                temp = temp.next;  // advance temp to the next
            }
            curr.next = temp;
            curr = curr.next;  // advance curr
        }
        return root;
    }
}

// For the problem at https://leetcode.com/problems/reverse-linked-list/

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
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;  // track the node before our current one
        while(currNode != null) {  // check we have a node here
            ListNode nextNode = currNode.next;  // get the next node
            currNode.next = prevNode; // set current next node to the one before this one so now we point at the last node
            prevNode = currNode;  // set our previous node to the current node
            currNode = nextNode;  // set our current node to the next node and repeat
        }
        return prevNode;
    }
}

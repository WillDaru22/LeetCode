/**  For the question at https://leetcode.com/problems/add-two-numbers/
*/

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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String one = "";
        String two = "";
        one+=l1.val;
        two+=l2.val;
        while(l1.next != null) {
            l1 = l1.next;
            one+=l1.val;
        }
        while(l2.next != null) {
            l2 = l2.next;
            two+=l2.val;
        }
        StringBuilder reversea = new StringBuilder(one);
        reversea = reversea.reverse();
        one = reversea.toString();
        reversea = new StringBuilder(two);
        reversea = reversea.reverse();
        two = reversea.toString();
        //Double gaka = Double.parseDouble(one) + Double.parseDouble(two);
        BigInteger e = new BigInteger(one);
        BigInteger y = new BigInteger(two);
        BigInteger i = e.add(y);
        //System.out.println(i);
        String nb = String.valueOf(i);
        ListNode t, head = new ListNode(Character.getNumericValue(nb.charAt(nb.length()-1)));
        t = head;
        for(int p = nb.length()-2; p >= 0; p--) {
            t.next = new ListNode(Character.getNumericValue(nb.charAt(p)));
            t = t.next;
        }
    return head;
    }
}

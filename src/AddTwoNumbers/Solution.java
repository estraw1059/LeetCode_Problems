package AddTwoNumbers;

import java.util.ArrayList;

//Add-Two-Numbers can be found here: https://leetcode.com/problems/add-two-numbers/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int totalVal = (carryOver + val1 + val2)%10;
            carryOver = (carryOver + val1 + val2)/10;
            digits.add(totalVal);
            l1 = updateNode(l1);
            l2 = updateNode(l2);
        }

        if(carryOver != 0) {
            digits.add(carryOver);
        }

        ListNode response = new ListNode(digits.get(0));
        ListNode currentNode = response;
        for(int i = 1; i < digits.size(); i++) {
            ListNode tempNode = new ListNode(digits.get(i));
            currentNode.next = tempNode;
            currentNode = tempNode;
        }
        return response;
    }


    private ListNode updateNode(ListNode l) {
        if(l == null || l.next == null) {
            return null;
        }
        return l.next;
    }
}

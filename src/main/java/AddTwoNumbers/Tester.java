package AddTwoNumbers;

public class Tester {
    public static void main(String args[]) {
        //10
        ListNode ones = new ListNode(0);
        ListNode tens = new ListNode(1);
        ones.next = tens;

        //3
        ListNode three = new ListNode(3);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(ones, three);

        if(result.val != 3) {
            System.out.println("Error");
        }

        if(result.next.val != 1) {
            System.out.println("Error");
        }

    }
}

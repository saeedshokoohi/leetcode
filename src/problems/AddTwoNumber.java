package problems;

public class AddTwoNumber {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode result = sum;
        int nextAdded = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;

            int psum = (nextAdded + n1 + n2) % 10;
            nextAdded = (nextAdded + n1 + n2) / 10;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            sum.val=psum;
            sum.next = new ListNode();
            sum = sum.next;

        }
        if (nextAdded > 0) {
            sum.next = new ListNode(nextAdded);
        }
        return result.next;
    }
}

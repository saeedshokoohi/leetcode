package problems;

public class RotateLinkList {
/*

            Given the head of a linked list, rotate the list to the right by k places.



            Example 1:


            Input: head = [1,2,3,4,5], k = 2
            Output: [4,5,1,2,3]
            Example 2:


            Input: head = [0,1,2], k = 4
            Output: [2,0,1]


            Constraints:

            The number of nodes in the list is in the range [0, 500].
            -100 <= Node.val <= 100
            0 <= k <= 2 * 109
 */

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode newHead=head;
        int nodeLength=1;
        boolean endOfList=false;
        while (k > 0) {
            newHead = rotateOneToRight(newHead);
            k--;
            if(!endOfList && newHead==head){
                endOfList=true;
                k=k%nodeLength;
            }else
            {
                nodeLength++;
            }
        }
        return newHead;
    }

    private ListNode rotateOneToRight(ListNode head) {

        ListNode tail = head;
        ListNode preTail = null;
        while (tail.next != null) {
            preTail = tail;
            tail = tail.next;
        }
        preTail.next = null;
        tail.next = head;
        return tail;
    }
}

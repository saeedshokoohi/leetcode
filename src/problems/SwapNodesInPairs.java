package problems;

public class SwapNodesInPairs {
    /*
    Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)



Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
     */
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        head=head.next;
        ListNode nextHead=head.next;
        head.next=temp;
        temp.next=swapPairs(nextHead);

        return  head;

    }
}

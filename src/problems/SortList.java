package problems;

public class SortList {
    /*
    Given the head of a linked list, return the list after sorting it in ascending order.



Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105


Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
     */
    public ListNode sortList(ListNode head) {
         if(head==null || head.next==null)return head;
        return bubbleSort(head);


    }

    private ListNode bubbleSort(ListNode head) {

        ListNode current=head;
        ListNode outerPointer=current;
        boolean isSorted=false;
        ListNode LastChangedNode=null;
        while (!(isSorted || outerPointer.next==null) ) {

           isSorted=true;
           current=head;

            while (( current.next != null && LastChangedNode!=current.next)) {

                if (current.val > current.next.val) {
                    int temp = current.val;
                    current.val = current.next.val;
                    LastChangedNode=current.next;
                    current.next.val = temp;
                    isSorted = false;
                }
                current = current.next;
            }
            outerPointer=outerPointer.next;
        }
        return head;
    }
}

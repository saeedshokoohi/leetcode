package problems;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedList {
    /*
    Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.



        Example 1:


        Input: head = [1,2,3,3,4,4,5]
        Output: [1,2,5]
        Example 2:


        Input: head = [1,1,1,2,3]
        Output: [2,3]


        Constraints:

        The number of nodes in the list is in the range [0, 300].
        -100 <= Node.val <= 100
        The list is guaranteed to be sorted in ascending order.
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode retNode = new ListNode(0,head);
        HashMap<Integer, Boolean> distinct = new HashMap<>();

        while (head != null) {
            distinct.put(head.val, distinct.containsKey(head.val) ? false : true);
            head = head.next;
        }
        head=retNode;
        while (head.next!=null)
        {
            Boolean isValid = distinct.get(head.next.val);
            if(!isValid)
            {
                head.next=head.next.next;
            }else
            head=head.next;
        }
        return retNode.next;

    }
}

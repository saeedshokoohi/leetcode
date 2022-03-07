package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {
    @Test
    public void testMergeTwoLists() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(5)));
        ListNode result=mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(2,result.next.next.val);
    }

}


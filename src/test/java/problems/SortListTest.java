package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SortListTest {
    @Test
    public void testSortList() {
        SortList sortList = new SortList();
        ListNode listNode = new ListNode(42);
        assertSame(listNode, sortList.sortList(listNode));
    }

    @Test
    public void testSortList2() {
        assertNull((new SortList()).sortList(null));
    }

    @Test
    public void testSortList3() {
        SortList sortList = new SortList();
        ListNode head = new ListNode(4, new ListNode(2,new ListNode(1,new ListNode(3))));


        assertSame(1, sortList.sortList(head).val);
        assertSame(2, sortList.sortList(head).next.val);
        assertSame(3, sortList.sortList(head).next.next.val);
        assertSame(4, sortList.sortList(head).next.next.next.val);
    }



}


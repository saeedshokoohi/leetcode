package problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListCycleTest {
    @Test
    public void testHasCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode n4=new ListNode(-4);
        ListNode n3=new ListNode(0,n4);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(3,n2);
        n4.next=n2;
        assertTrue(linkedListCycle.hasCycle(n1));
    }
    @Test
    public void testHasNotCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();

        ListNode n2=new ListNode(2);
        ListNode n1=new ListNode(3,n2);
        assertFalse(linkedListCycle.hasCycle(n1));
    }
}


package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SwapNodesInPairsTest {
    @Test
    public void testSwapPairs() {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode listNode = new ListNode(42);
        assertSame(listNode, swapNodesInPairs.swapPairs(listNode));
    }

    @Test
    public void testSwapPairs2() {
        assertNull((new SwapNodesInPairs()).swapPairs(null));
    }



    @Test
    public void testSwapPairs4() {
        //given
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        //when
        ListNode head=swapNodesInPairs.swapPairs(n1);
        //then
        assertSame(n2,head);
        assertSame(n1,head.next);
        assertSame(n4,head.next.next);
        assertSame(n3,head.next.next.next);



    }
}


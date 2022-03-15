package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class RotateLinkListTest {
    @Test
    public void testRotateRightOneNode() {
        RotateLinkList rotateLinkList = new RotateLinkList();
        ListNode listNode = new ListNode(42);
        listNode= rotateLinkList.rotateRight(listNode,5);
        assertEquals(42,listNode.val);
    }
    @Test
    public void testRotateRight() {
        RotateLinkList rotateLinkList = new RotateLinkList();
        ListNode listNode = new ListNode(42, new ListNode(1));
        listNode= rotateLinkList.rotateRight(listNode,3);
        assertEquals(1,listNode.val);
    }
    @Test
    public void testRotateRight2() {
        RotateLinkList rotateLinkList = new RotateLinkList();
        ListNode listNode = new ListNode(42, new ListNode(1));
        listNode= rotateLinkList.rotateRight(listNode,5);
        assertEquals(1,listNode.val);
    }
    @Test
    public void testRotateRightLargeNumber() {
        RotateLinkList rotateLinkList = new RotateLinkList();
        ListNode listNode = new ListNode(42, new ListNode(1));
        listNode= rotateLinkList.rotateRight(listNode,1000000000);
        assertEquals(42,listNode.val);
    }
}


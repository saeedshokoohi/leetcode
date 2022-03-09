package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode actualDeleteDuplicatesResult = removeDuplicatesFromSortedList.deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(2))));
        assertEquals(2, actualDeleteDuplicatesResult.val);
        assertEquals(null, actualDeleteDuplicatesResult.next);

    }

}


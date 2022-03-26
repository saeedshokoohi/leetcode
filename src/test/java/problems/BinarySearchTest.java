package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testSearch() {
        assertEquals(4, (new BinarySearch()).search(new int[]{1, 2, 4, 9,12}, 12));
        assertEquals(0, (new BinarySearch()).search(new int[]{1, 2, 4, 9}, 1));
        assertEquals(-1, (new BinarySearch()).search(new int[]{1, 2, 4, 9}, 5));
    }
}



package problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchRotatedSortedArrayTest {
    @Test
    public void testSearch() {
        assertTrue(  (new SearchRotatedSortedArray()).search(new int[]{1,0,1,1,1}, 0));
      assertTrue(  (new SearchRotatedSortedArray()).search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2));

      assertFalse(  (new SearchRotatedSortedArray()).search(new int[]{1}, 0));
      assertTrue(  (new SearchRotatedSortedArray()).search(new int[]{2,5,6,0,0,1,2}, 1));
      assertFalse(  (new SearchRotatedSortedArray()).search(new int[]{2,5,6,0,0,1,2}, 3));
    }


}


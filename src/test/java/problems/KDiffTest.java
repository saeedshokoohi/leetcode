package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KDiffTest {
    @Test
    public void testFindPairs() {
        assertEquals(2, (new KDiff()).findPairs(new int[]{3,1,4,1,5}, 2));
        assertEquals(4, (new KDiff()).findPairs(new int[]{1,2,3,4,5}, 1));
        assertEquals(1, (new KDiff()).findPairs(new int[]{1,3,1,5,4}, 0));
        assertEquals(1, (new KDiff()).findPairs(new int[]{1,1,1,1,1}, 0));


    }
}


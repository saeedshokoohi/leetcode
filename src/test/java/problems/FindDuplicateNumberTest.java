package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindDuplicateNumberTest {
    @Test
    public void testFindDuplicate() {
        assertEquals(3, (new FindDuplicateNumber()).findDuplicate(new int[]{3,1,3,4,2}));
        assertEquals(1, (new FindDuplicateNumber()).findDuplicate(new int[]{1, 1}));
        assertEquals(2, (new FindDuplicateNumber()).findDuplicate(new int[]{1, 2, 2, 3}));
    }
}


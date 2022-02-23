package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void testSingleNumber() {
        assertEquals(4, (new SingleNumber()).singleNumber(new int[]{4, 2, 1, 2,1}));
        assertEquals(3, (new SingleNumber()).singleNumber(new int[]{1, 2, 1, 2, 3, 1000, 1000}));
    }
}


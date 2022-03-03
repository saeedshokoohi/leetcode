package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticSlicesTest {
    @Test
    public void testNumberOfArithmeticSlices() {
        assertEquals(3, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{15,14,13,18,2,7,12,-20,1,2,7,12}));
        assertEquals(1, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{18,2,7,12,-20,1}));
        assertEquals(120, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
        assertEquals(1, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{-1,-2,-3}));
        assertEquals(10, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{1,2,3,4,5,6}));
        assertEquals(3, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{1,2,3,4}));
        assertEquals(0, (new ArithmeticSlices()).numberOfArithmeticSlices(new int[]{}));
    }
}


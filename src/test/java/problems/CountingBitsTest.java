package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {
    @Test
    public void testCountBits() {
        int[] actualCountBitsResult = (new CountingBits()).countBits(5);
        assertArrayEquals(new int[]{0,1,1,2,1,2},actualCountBitsResult);
    }


}


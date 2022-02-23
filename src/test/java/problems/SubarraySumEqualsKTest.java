package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubarraySumEqualsKTest {
    @Test
    public void testSubarraySum() {
        assertEquals(0, (new SubarraySumEqualsK()).subarraySum(new int[]{
                1}, 0));
        assertEquals(2, (new SubarraySumEqualsK()).subarraySum(new int[]{1,2,3}, 3));
        assertEquals(4, (new SubarraySumEqualsK()).subarraySum(new int[]{
                1,2,1,2,1}, 3));





    }
}


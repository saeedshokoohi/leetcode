package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeleteAndEarnTest {
    @Test
    public void testDeleteAndEarn() {
        assertEquals(52, (new DeleteAndEarn()).deleteAndEarn(new int[]{8,7,3,8,1,4,10,10,10,2}));
        assertEquals(61, (new DeleteAndEarn()).deleteAndEarn(new int[]{8,3,4,7,6,6,9,2,5,8,2,4,9,5,9,1,5,7,1,4}));
        assertEquals(9, (new DeleteAndEarn()).deleteAndEarn(new int[]{2, 2, 3,3,3,4}));
        assertEquals(6, (new DeleteAndEarn()).deleteAndEarn(new int[]{3, 4, 2}));
        assertEquals(5, (new DeleteAndEarn()).deleteAndEarn(new int[]{3, 2,2,1,1}));
        assertEquals(66, (new DeleteAndEarn()).deleteAndEarn(new int[]{3,7,10,5,2,4,8,9,9,4,9,2,6,4,6,5,4,7,6,10}));






    }
}


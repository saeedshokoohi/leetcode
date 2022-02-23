package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
    @Test
    public void testCombinationSum() {
       // assertTrue((new CombinationSum()).combinationSum(new int[]{}, 1).isEmpty());
        assertEquals(2, (new CombinationSum()).combinationSum(new int[]{2,3,6,7}, 7).size());

    }


}


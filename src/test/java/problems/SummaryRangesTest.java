package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.List;

import org.junit.Test;

public class SummaryRangesTest {
    @Test
    public void testSummaryRanges() {
        List<String> actualSummaryRangesResult = (new SummaryRanges()).summaryRanges(new int[]{0,1,2,4,5,7});
        assertEquals(3, actualSummaryRangesResult.size());
        assertEquals("0->2", actualSummaryRangesResult.get(0));
        assertEquals("4->5", actualSummaryRangesResult.get(1));
        assertEquals("7", actualSummaryRangesResult.get(2));
    }
    //[-2147483648,-2147483647,2147483647]
    @Test
    public void testSummaryRanges2() {
        List<String> actualSummaryRangesResult = (new SummaryRanges()).summaryRanges(new int[]{-2147483648,-2147483647,2147483647});
        assertEquals(2, actualSummaryRangesResult.size());
        assertEquals("-2147483648->-2147483647", actualSummaryRangesResult.get(0));
        assertEquals("2147483647", actualSummaryRangesResult.get(1));
    }

}


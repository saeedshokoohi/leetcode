package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCoveredIntervalsTest {
    @Test
    public void removeCoveredIntervalsTest()
    {
        //given
        RemoveCoveredIntervals testClass=new RemoveCoveredIntervals();

        //then
        assertEquals(1,testClass.removeCoveredIntervals(new int[][]{{1,2},{1,4},{3,4}}));
        assertEquals(2,testClass.removeCoveredIntervals(new int[][]{{1,4},{3,6},{2,8}}));
        assertEquals(1,testClass.removeCoveredIntervals(new int[][]{{1,4},{2,3}}));
        assertEquals(2,testClass.removeCoveredIntervals(new int[][]{{1,4},{3,5}}));
    }
}

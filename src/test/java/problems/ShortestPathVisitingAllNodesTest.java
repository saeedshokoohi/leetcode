package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestPathVisitingAllNodesTest {
    @Test
    public void testShortestPathLength() {
        assertEquals(4,
                (new ShortestPathVisitingAllNodes()).shortestPathLength(new int[][]{{1},{0,2,4},{1,3,4},{2},{1,2}}));
        assertEquals(4,
                (new ShortestPathVisitingAllNodes()).shortestPathLength(new int[][]{{1,2,3},{0},{0},{0}}));


    }


}


package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ChampagneTowerTest {
    @Test
    public void testChampagneTower() {
        assertEquals(0.18750, (new ChampagneTower()).champagneTower(25, 6, 1),0.0);
        assertEquals(1.0, (new ChampagneTower()).champagneTower(100000009, 33, 17),0.0);
        assertEquals(0.5, (new ChampagneTower()).champagneTower(2, 1, 1),0.0);
        assertEquals(0.0, (new ChampagneTower()).champagneTower(1, 1, 1),0.0);

    }
}


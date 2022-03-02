package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareVersionNumbersTest {
    @Test
    public void testCompareVersion() {
        assertEquals(1, (new CompareVersionNumbers()).compareVersion("1.0.2", "1"));
        assertEquals(0, (new CompareVersionNumbers()).compareVersion("1.0.2", "1.0.2"));
    }
}


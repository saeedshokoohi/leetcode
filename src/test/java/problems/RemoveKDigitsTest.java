package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveKDigitsTest {
    @Test
    public void testRemoveKdigits() {
        assertEquals("1", (new RemoveKDigits()).removeKdigits("10001", 1));
        assertEquals("0", (new RemoveKDigits()).removeKdigits("10", 1));
        assertEquals("0", (new RemoveKDigits()).removeKdigits("10", 2));
        assertEquals("200", (new RemoveKDigits()).removeKdigits("10200", 1));
        assertEquals("1219", (new RemoveKDigits()).removeKdigits("1432219", 3));


    }
}


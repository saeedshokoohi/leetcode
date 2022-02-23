package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddDigitsTest {
    @Test
    public void testAddDigits() {
        assertEquals(1, (new AddDigits()).addDigits(10));
        assertEquals(1, (new AddDigits()).addDigits(10));
    }

    @Test
    public void testAddDigits2() {
        AddDigits addDigits = new AddDigits();
        addDigits.addDigits(10);
        assertEquals(2, addDigits.addDigits(2));
    }
}


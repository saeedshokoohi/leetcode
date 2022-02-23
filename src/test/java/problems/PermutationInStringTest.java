package problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PermutationInStringTest {
    @Test
    public void testCheckInclusion() {
        assertTrue((new PermutationInString()).checkInclusion("adc", "dcda"));

        assertFalse((new PermutationInString()).checkInclusion("bo", "eidbaooo"));
        assertTrue((new PermutationInString()).checkInclusion("ab", "eidbaooo"));

    }


}


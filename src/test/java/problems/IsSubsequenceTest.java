package problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsSubsequenceTest {
    @Test
    public void testIsSubsequence() {
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
        assertTrue((new IsSubsequence()).isSubsequence("ab", "baab"));
        assertTrue((new IsSubsequence()).isSubsequence("abc", "ahbgdc"));
    }
}


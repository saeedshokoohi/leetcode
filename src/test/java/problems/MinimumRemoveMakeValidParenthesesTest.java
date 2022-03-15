package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumRemoveMakeValidParenthesesTest {
    @Test
    public void testMinRemoveToMakeValid() {
        assertEquals(
                "lee(t(c)o)de", (new MinimumRemoveMakeValidParentheses()).minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("((foo))", (new MinimumRemoveMakeValidParentheses()).minRemoveToMakeValid("(((foo))"));
        assertEquals("(((foo)))", (new MinimumRemoveMakeValidParentheses()).minRemoveToMakeValid("(((foo))))"));
        assertEquals("(((fo))o)", (new MinimumRemoveMakeValidParentheses()).minRemoveToMakeValid("(((fo))o))"));
    }
    @Test
    public void testMinRemoveToMakeValid2() {
        assertEquals("", (new MinimumRemoveMakeValidParentheses()).minRemoveToMakeValid("))(("));
    }
}


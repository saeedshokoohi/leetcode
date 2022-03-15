package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplifyPathTest {
    @Test
    public void testSimplifyPathRemovingLastSlash() {
        assertEquals("/home", (new SimplifyPath()).simplifyPath("/home/"));
    }
    @Test
    public void testSimplifyPathRemovingDoubleSlash() {
        assertEquals("/home/index", (new SimplifyPath()).simplifyPath("/home/////index/"));
    }

    @Test
    public void testSimplifyStartWithSlash() {
        assertEquals("/", (new SimplifyPath()).simplifyPath("/../"));
        assertEquals("/home/index", (new SimplifyPath()).simplifyPath("home/////index/"));
    }

    @Test
    public void testSimplifyRemoveAfterDots() {
        assertEquals("/c", (new SimplifyPath()).simplifyPath("/a/../../b/../c//.//"));
        assertEquals("/c", (new SimplifyPath()).simplifyPath("/a/./b/../../c/"));
    }


}


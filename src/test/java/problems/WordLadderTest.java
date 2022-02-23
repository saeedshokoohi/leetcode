package problems;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordLadderTest {
    @Test
    public void ladderLength() {
        WordLadder testClass = new WordLadder();

        assertEquals(3, testClass.ladderLength("hot", "dog", List.of("hot","cog","dog","tot","hog","hop","pot","dot")));
        assertEquals(2, testClass.ladderLength("hot", "dot", List.of("hot","dot","dog")));
        assertEquals(5, testClass.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));


        assertEquals(0, testClass.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
//        assertEquals(2, testClass.ladderLength("a", "c", List.of("a", "b", "c")));





    }

    @Test
    public void testCheckSingleDiff() {
        assertTrue((new WordLadder()).checkSingleDiff("hit", "hot"));
        assertFalse((new WordLadder()).checkSingleDiff("hit", "hog"));

    }
}


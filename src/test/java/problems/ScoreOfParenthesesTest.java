package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreOfParenthesesTest {

    @Test
    public void scoreOfParentheses()
    {
        ScoreOfParentheses scoreOfParentheses=new ScoreOfParentheses();

       assertEquals(6, scoreOfParentheses.scoreOfParentheses("((())())"));
       assertEquals(4, scoreOfParentheses.scoreOfParentheses("(()())"));
       assertEquals(2, scoreOfParentheses.scoreOfParentheses("()()"));

    }
}

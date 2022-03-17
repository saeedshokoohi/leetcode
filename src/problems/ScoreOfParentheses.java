package problems;

import java.util.HashMap;
import java.util.Stack;

public class ScoreOfParentheses {
    /*
             Given a balanced parentheses string s, return the score of the string.

            The score of a balanced parentheses string is based on the following rule:

            "()" has score 1.
            AB has score A + B, where A and B are balanced parentheses strings.
            (A) has score 2 * A, where A is a balanced parentheses string.


            Example 1:

            Input: s = "()"
            Output: 1
            Example 2:

            Input: s = "(())"
            Output: 2
            Example 3:

            Input: s = "()()"
            Output: 2


            Constraints:

            2 <= s.length <= 50
            s consists of only '(' and ')'.
            s is a balanced parentheses string.
     */
    public int scoreOfParentheses(String s) {

        HashMap<Integer, Integer> openClose = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                openClose.put(stack.pop(), i);
            }
        }
        return calculateScore(openClose, 0, s.length() - 1);


    }

    private int calculateScore(HashMap<Integer, Integer> openClose, int from, int to) {
        Integer close = openClose.get(from);
        if(close.equals(from+1) && close==to)return 1;
        if (close.equals(to)) {
            int innerScore = calculateScore(openClose, from + 1, to - 1);
            return 2 * innerScore;
        }else
        {
          return  calculateScore(openClose,from,close)+calculateScore(openClose,close+1,to);
        }

    }

}

package problems;

import java.util.Stack;

public class MinimumRemoveMakeValidParentheses {
    /*
    Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.


Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.


Constraints:

1 <= s.length <= 105
s[i] is either'(' , ')', or lowercase English letter.
     */

    public String minRemoveToMakeValid(String s) {
        Stack<ParenthesesOrder> parentheses=new Stack<>();
        int i=0;

        while (i<s.length())
        {
            char c = s.charAt(i);
            if(c=='(' || (parentheses.empty() && c==')') )
            {
                parentheses.push(new ParenthesesOrder(c,i));
            }else if(c==')')
            {
                    ParenthesesOrder last = parentheses.peek();
                    if (last.c == ')') {
                        parentheses.push(new ParenthesesOrder(c, i));
                    }
                    else
                    {
                        parentheses.pop();
                    }
            }
            i++;
        }
        StringBuilder sb = new StringBuilder(s);
        while (!parentheses.empty())
        {
            ParenthesesOrder p = parentheses.pop();
            sb.deleteCharAt(p.index);
        }
        return sb.toString();


    }
    private class ParenthesesOrder
    {
        char c;
        int index;

        public ParenthesesOrder(char c, int index) {
            this.c = c;
            this.index = index;
        }
    }


}

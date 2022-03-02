package problems;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
     */
    public boolean isSubsequence(String s, String t) {
        List<List<Integer>> orders=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            List<Integer> repeats=new ArrayList<>();
            int i=t.indexOf(c,0);
            while (i>=0)
            {
                repeats.add(i);
                i=t.indexOf(c,i+1);
            }
            if(repeats.size()==0)return false;
            orders.add(repeats);
        }
        int lastIndex=-1;
        for(List<Integer> o:orders)
        {
            boolean isAvailable=false;
            for(Integer i:o)
            {
                if(i>lastIndex)
                {
                    isAvailable=true;
                    lastIndex=i;
                    break;
                }

            }
            if(!isAvailable)return false;
        }
        return  true;
    }
}

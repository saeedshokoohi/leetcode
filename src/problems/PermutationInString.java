package problems;

import java.util.HashMap;

/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

        In other words, return true if one of s1's permutations is the substring of s2.



        Example 1:

        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").
        Example 2:

        Input: s1 = "ab", s2 = "eidboaoo"
        Output: false*/
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        HashMap<Character,Integer> sCount=new HashMap<>();
        for(char c:s1.toCharArray())
        {
            if(sCount.containsKey(c))
                sCount.put(c,sCount.get(c)+1);
            else
                sCount.put(c,1);
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++)
        {
            if(isPermutation(sCount,s2.substring(i,i+s1.length())))return true;

        }
        return false;

    }
    public  boolean isPermutation(HashMap<Character,Integer> _sCount,String s2)
    {
        HashMap<Character,Integer> sCount=(HashMap<Character,Integer>)_sCount.clone();

        for(char c:s2.toCharArray())
        {
            if(!sCount.containsKey(c))return  false;
            sCount.put(c,sCount.get(c)-1);
            if(sCount.get(c)==0)sCount.remove(c);
        }
        return !(sCount.size()>0);
    }
}

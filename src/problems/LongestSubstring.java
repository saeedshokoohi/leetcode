package problems;

public class LongestSubstring {

    public static void main(String[] args) {
        String s="abcabcbb";
        LongestSubstring test=new LongestSubstring();
        System.out.println(test.lengthOfLongestSubstring(s));

    }
    public int lengthOfLongestSubstring(String s) {
        char[] chars= s.toCharArray();
        char[] sub=new char[chars.length];
        int[] subIndex=new int[chars.length];
        int maxLength=0;
        int subLength=0;
        for(int i=0;i<chars.length;i++)
        {
            char indexChar=chars[i];
            boolean isInSub=false;
            int rIndex=0;
            for(int j=0;j<subLength;j++)
            {
                if(sub[j]==indexChar)
                {
                    isInSub=true;
                    rIndex=subIndex[j];
                    break;
                }
            }
            if(!isInSub)
            {
                sub[subLength]=indexChar;
                subIndex[subLength]=i;
                subLength++;
                if(subLength>maxLength)
                    maxLength=subLength;


            }else
            {
                if(subLength>maxLength)
                    maxLength=subLength;

                i=rIndex+1;
                sub[0]=chars[i];
                subIndex[0]=i;
                subLength=1;


            }

        }
        return maxLength;
    }
}

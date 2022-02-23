package problems;

import java.util.HashMap;

public class StringDiff {

    public char findTheDifference(String s, String t) {
        //map for counting the characters in source string
        HashMap<Character, Integer> smap = new HashMap<>();
        //putting source string into the hash map
        for (int j = 0; j < s.length(); j++) {
            smap.merge(s.charAt(j), 1, Integer::sum);
        }
        //checking if any the chars is available in the hashmap
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!smap.containsKey(c)) {
                return c;
            } else {
                int count = smap.get(c);
                if (count == 1)
                    smap.remove(c);
                else
                    smap.replace(c, count - 1);

            }
        }
        return ' ';

    }
}

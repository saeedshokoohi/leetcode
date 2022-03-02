package problems;

import java.util.*;
import java.util.stream.Collectors;

public class WordLadder {
    /*
    A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

    Every adjacent pair of words differs by a single letter.
    Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
    sk == endWord
    Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.



    Example 1:

    Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
    Output: 5
    Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
    Example 2:

    Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
    Output: 0
    Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.


    Constraints:

    1 <= beginWord.length <= 10
    endWord.length == beginWord.length
    1 <= wordList.length <= 5000
    wordList[i].length == beginWord.length
    beginWord, endWord, and wordList[i] consist of lowercase English letters.
    beginWord != endWord
    All the words in wordList are unique.
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> visited = new HashSet<>();
        queue.add(beginWord);

        int changes = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return changes;

                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = (char) k;

                        String str = new String(arr);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;

    }

    public Integer checkTree(String from, String end, List<String> wordList, Integer depth) {
        if (from.equals(end)) return depth;
        List<String> validBranches = wordList.stream().filter(w -> checkSingleDiff(w, from)).collect(Collectors.toList());
        Integer minDepth = 0;
        for (String w : validBranches) {
            System.out.println(w);
            List<String> newWorldList = wordList.stream().filter(i->!i.equals(w)).collect(Collectors.toList());
            depth++;
            Integer reachedDepth = checkTree(w, end, newWorldList, depth);
            if ((reachedDepth > 0 && reachedDepth < minDepth) || (minDepth == 0 && reachedDepth > 0)) {
                minDepth = reachedDepth;
                System.out.println("founded depth"+minDepth);

            }

        }
        return minDepth;

    }

    public boolean checkSingleDiff(String from, String to) {
        int diff = from.length();
        for (int i = 0; i < from.length(); i++) {
            if (to.charAt(i) == from.charAt(i))
                diff--;
        }

        return diff == 1;


    }


}

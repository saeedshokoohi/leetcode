package problems;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    /*
    Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

    The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

    It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.



    Example 1:

    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    Explanation:
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.
    These are the only two combinations.
    Example 2:

    Input: candidates = [2,3,5], target = 8
    Output: [[2,2,2,2],[2,3,3],[3,5]]
    Example 3:

    Input: candidates = [2], target = 1
    Output: []


    Constraints:

    1 <= candidates.length <= 30
    1 <= candidates[i] <= 200
    All elements of candidates are distinct.
    1 <= target <= 500
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<Integer> candidateSet=new HashSet<>();
        for(int n:candidates)
        {
            if(n<=target)candidateSet.add(n);
        }

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();

        result.addAll(recCombinationSum(candidateSet, sub, target));
        return result;


    }
    public Set<List<Integer>> recCombinationSum(HashSet<Integer> candidates, List<Integer> sub, Integer target)
    {

            Set<List<Integer>> result=new HashSet<>();
            for(Integer c:candidates)
            {
                List<Integer> newSub=new ArrayList<>(sub);
                newSub.add(c);
                if(target-c==0)
                {
                    result.add(newSub.stream().sorted().collect(Collectors.toList()));
                }
                else if(target-c>0) {
                    Set<List<Integer>> newList = recCombinationSum(candidates, newSub, target - c);
                    for (List<Integer> r : newList) {
                        result.add(r.stream().sorted().collect(Collectors.toList()));
                    }
                }
            }
            return result;

    }
}


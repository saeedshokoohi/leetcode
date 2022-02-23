package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Subset {
    /*
    Given an integer array nums of unique elements, return all possible subsets (the power set).

    The solution set must not contain duplicate subsets. Return the solution in any order.



    Example 1:

    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    Example 2:

    Input: nums = [0]
    Output: [[],[0]]


    Constraints:

    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    All the numbers of nums are unique.
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        //converting array to list
        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        //adding empty subset
        subsets.add(List.of());
        if (nums.length > 0) {

            //adding itself az subset

            subsets.addAll(recSubset(numList));


        }
        //  System.out.println(subsets);
        return subsets;

    }

    List<List<Integer>> recSubset(List<Integer> set) {
//        System.out.println("calling recSubset");
//        System.out.println(set);
        //if set has only one member add as a single subset
        if (set.size() == 1) return List.of(set);
        List<List<Integer>> subsets = new ArrayList<>();
        Integer first = set.get(0);
        //adding the single subset
        subsets.add(List.of(first));
        //removing the added single subset from array
        set.remove(first);
        //calculating subsets for remaining members
        List<List<Integer>> innerSubset;

        innerSubset = recSubset(set);
        //adding all subset for remaining members

        subsets.addAll(innerSubset);
        //also combining the removed subset to subsets remaining subsets to make new subset
        for (List<Integer> s : innerSubset) {
            List<Integer> sc = new ArrayList<>(s);
            sc.add(first);
            subsets.add(sc);

        }
        return subsets;
    }


}

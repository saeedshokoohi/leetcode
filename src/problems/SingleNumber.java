package problems;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class SingleNumber {
    /*
            136. Single Number
        Easy

        8782

        308

        Add to List

        Share
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1
             */
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
            if(!set.remove(n)) set.add(n);

      return set.iterator().next();



    }
}

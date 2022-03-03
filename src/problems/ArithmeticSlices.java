package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArithmeticSlices {
    /*
    An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

    For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
    Given an integer array nums, return the number of arithmetic subarrays of nums.

    A subarray is a contiguous subsequence of the array.



    Example 1:

    Input: nums = [1,2,3,4]
    Output: 3
    Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
    Example 2:

    Input: nums = [1]
    Output: 0


    Constraints:

    1 <= nums.length <= 5000
    -1000 <= nums[i] <= 1000
     */
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        List<Integer> repeats=new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {

            //starting from index i
            List<Integer> initList = new ArrayList<>();
            initList.add(nums[i]);
            initList.add(nums[i + 1]);
            int diff=nums[i + 1]-nums[i];
            for (int j = i + 2; j < nums.length; j++) {
                //if the first two array difference is the same as current item on index z with the last added item
                if (diff== nums[j] - initList.get(initList.size() - 1)) {
                    initList.add(nums[j]);
                } else {
                    //if not finish
                    break;
                }
            }
            repeats.add(initList.size());
        }
        int count=0;
        for(Integer l:repeats)
        {
            if (l> 2) {
               count+= l - 2;
            }
        }
      return count;
    }
}

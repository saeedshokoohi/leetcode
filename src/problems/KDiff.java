package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//
///
/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i < j < nums.length
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.



Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
 */
public class KDiff {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Boolean> pairs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length>1 && nums[i]+k>nums[nums.length-1])break;
            if(!pairs.containsKey(nums[i])) {
                int index=Arrays.binarySearch(nums,i+1,nums.length, nums[i] + k);
             if(   index>-1 )
             {
                 pairs.put(nums[i],true);
             }
            }

        }
        return pairs.size();
    }

}

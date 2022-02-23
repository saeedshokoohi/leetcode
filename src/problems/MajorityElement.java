package problems;

import java.util.Arrays;

public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
     */
    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];
        Arrays.sort(nums);
        int mid=nums.length%2==0? nums.length/2 : (nums.length/2)+1;
        return nums[mid-1];
    }
}

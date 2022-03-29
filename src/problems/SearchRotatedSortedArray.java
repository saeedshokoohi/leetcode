package problems;

public class SearchRotatedSortedArray {

    /*
    There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

        Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

        Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

        You must decrease the overall operation steps as much as possible.



        Example 1:

        Input: nums = [2,5,6,0,0,1,2], target = 0
        Output: true
        Example 2:

        Input: nums = [2,5,6,0,0,1,2], target = 3
        Output: false


        Constraints:

        1 <= nums.length <= 5000
        -104 <= nums[i] <= 104
        nums is guaranteed to be rotated at some pivot.
        -104 <= target <= 104
     */
    public boolean search(int[] nums, int target) {
        int index = findPivotIndex( nums, target);
        if (target == nums[index]) return true;
        if(target<nums[index] && target>nums[nums.length-1])return binarySearch(0, index, nums, target)!=-1;
        if(target>nums[index]) return binarySearch(index+1>=nums.length?nums.length-1:index+1, nums.length - 1, nums, target) != -1;
        return binarySearch(0, index, nums, target) != -1 || binarySearch(index+1>=nums.length?nums.length-1:index+1, nums.length - 1, nums, target) != -1;
    }

    private int findPivotIndex( int[] nums, int target) {
        int i=0;
     while (i<nums.length-1)
     {
         if(nums[i]>nums[i+1] || nums[i]==target)break;
         i++;
     }
     return i;
    }

    int binarySearch(int from, int to, int[] nums, int target) {
        if (to == from) {
            return nums[from] == target ? from : -1;
        } else {
            int mid = ((to - from) / 2) + from;
            return target <= nums[mid] ? binarySearch(from, mid, nums, target) : binarySearch(mid + 1, to, nums, target);
        }
    }
}

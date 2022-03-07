package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DeleteAndEarn {
    /*
    You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

    Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
    Return the maximum number of points you can earn by applying the above operation some number of times.

            Example 1:

            Input: nums = [3,4,2]
            Output: 6
            Explanation: You can perform the following operations:
            - Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
            - Delete 2 to earn 2 points. nums = [].
            You earn a total of 6 points.
            Example 2:

            Input: nums = [2,2,3,3,3,4]
            Output: 9
            Explanation: You can perform the following operations:
            - Delete a 3 to earn 3 points. All 2's and 4's are also deleted. nums = [3,3].
            - Delete a 3 again to earn 3 points. nums = [3].
            - Delete a 3 once more to earn 3 points. nums = [].
            You earn a total of 9 points.


            Constraints:

            1 <= nums.length <= 2 * 104
            1 <= nums[i] <= 104

     */
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> repeats = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> {
            int loss1=o1.getValue()-(repeats.getOrDefault(o1.getKey()-1,0)+repeats.getOrDefault(o1.getKey()+1,0));
            int loss2=o2.getValue()-(repeats.getOrDefault(o2.getKey()-1,0)+repeats.getOrDefault(o2.getKey()+1,0));
            if(o1.getValue()!=o2.getValue())return Integer.compare(o1.getValue(),o2.getValue());
            if(loss1==loss2)return Integer.compare(o1.getValue(),o2.getValue());
          return  Integer.compare(loss2,loss1);
        });
        for (int n : nums) {
            Integer m = repeats.get(n);
            repeats.put(n, m != null ? m + n : n);

        }

        int earn = 0;
        for (Map.Entry e : repeats.entrySet()) {
            queue.offer(e);
        }
        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> top = queue.poll();
            if (repeats.containsKey(top.getKey())) {
                System.out.println(String.format("removed items:%d of %d ",top.getValue()/ top.getKey(),top.getKey()));
                earn += top.getValue();
                repeats.remove(top.getKey());
                repeats.remove(top.getKey() + 1);
                repeats.remove(top.getKey() - 1);
                queue.clear();
                for (Map.Entry e : repeats.entrySet()) {
                    queue.offer(e);
                }
            }
        }
        return earn;

    }


}

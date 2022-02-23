package problems;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveCoveredIntervals {
    /*
    Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.

Return the number of remaining intervals.



Example 1:

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
Example 2:

Input: intervals = [[1,4],[2,3]]
Output: 1


Constraints:

1 <= intervals.length <= 1000
intervals[i].length == 2
0 <= li <= ri <= 105
All the given intervals are unique.
     */
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (set1, set2) -> Integer.compare(set2[1] - set2[0], set1[1] - set1[0]));
        int startIndex = 0;
        AtomicInteger length = new AtomicInteger(intervals.length);
        while (startIndex < length.get()-1) {
            int[] set = intervals[startIndex];
            startIndex++;
            removeCoveredForOneItem(set, intervals, startIndex, length);

        }

        return length.get();
    }

    private void removeCoveredForOneItem(int[] set, int[][] intervals, int startIndex, AtomicInteger length) {
        int j = startIndex;
        for (int i = startIndex; i < length.get(); i++) {
            int[] index = intervals[i];

            if (!((set[0] <= index[0] && set[1] >= index[1]) || (set[0] >= index[0] && set[1] <= index[1]))) {
                intervals[j] = index;
                j++;
            }
        }
        length.set(j);

    }
}

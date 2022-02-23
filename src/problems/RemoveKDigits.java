package problems;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveKDigits {
    /*
    Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.



Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

     */
    public String removeKdigits(String num, int k) {

        //putting in linked list to improve remove
        LinkedList<Character> nums = new LinkedList<>();
        for (char c : num.toCharArray()) nums.add(c);

        for (int i = 0; i < k; i++) {
            removeOneDigit(nums);
        }
        StringBuilder str = new StringBuilder();
        nums.stream().forEach(c -> {
            str.append(c.toString());
        });


        return str.toString();

    }

    private void removeOneDigit(LinkedList<Character> num) {
        if (num.size() == 1) {
            num.set(0, '0');
            return;
        }
        if (num.size() == 0) {
            num.addFirst( '0');
            return;
        }
        int indexToRemove = num.size() - 1;
        int i = 0;
        char first = ' ';
        char second = ' ';
        Iterator<Character> itra = num.iterator();

        first = itra.next();
        while (itra.hasNext()) {
            if (second != ' ')
                first = second;
            second = itra.next();
            if (first > second) {
                indexToRemove = i;
                break;
            }
            i++;
        }

        num.remove(indexToRemove);
        while (true) {
            if (num.size() > 0 && num.getFirst() == '0')
                num.removeFirst();
            else break;
        }

        if (num.size() == 0) {
            num.addFirst( '0');
            return;
        }

    }


}

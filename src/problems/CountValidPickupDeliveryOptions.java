package problems;

import java.util.HashSet;

public class CountValidPickupDeliveryOptions {

    /*
        Given n orders, each order consist in pickup and delivery services.

        Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i).

        Since the answer may be too large, return it modulo 10^9 + 7.



        Example 1:

        Input: n = 1
        Output: 1
        Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.
        Example 2:

        Input: n = 2
        Output: 6
        Explanation: All possible orders:
        (P1,P2,D1,D2), (P1,P2,D2,D1), (P1,D1,P2,D2), (P2,P1,D1,D2), (P2,P1,D2,D1) and (P2,D2,P1,D1).
        This is an invalid order (P1,D2,P2,D1) because Pickup 2 is after of Delivery 2.
        Example 3:

        Input: n = 3
        Output: 90


        Constraints:

        1 <= n <= 500
     */
    public int countOrders(int n) {

        Integer count = 0;
        HashSet<Integer> P = new HashSet<>();
        HashSet<Integer> D = new HashSet<>();
        while (n > 0) {
            P.add(n);
            n--;
        }

        for (Integer pi : P)
            count += pick(pi, P, D);

        return count;
    }


    private int pick(int i, HashSet<Integer> p, HashSet<Integer> d) {

        HashSet<Integer> pCopy, dCopy;
        pCopy = (HashSet<Integer>) p.clone();
        dCopy = (HashSet<Integer>) d.clone();
        pCopy.remove(i);
        dCopy.add(i);
        int count = 0;
        for (Integer pi : pCopy) {
            count += pick(pi, pCopy, dCopy);
        }

        for (Integer di : dCopy) {
            count += deliver(di, pCopy, dCopy);
        }
        return count;
    }

    private int deliver(int i, HashSet<Integer> p, HashSet<Integer> d) {

        HashSet<Integer> pCopy, dCopy;
        pCopy = (HashSet<Integer>) p.clone();
        dCopy = (HashSet<Integer>) d.clone();
        dCopy.remove(i);
        if (dCopy.isEmpty() && pCopy.isEmpty()) {

            return 1;
        }
        int count = 0;

        for (Integer pi : pCopy) {
            count += pick(pi, pCopy, dCopy);
        }
        for (Integer di : dCopy) {
            count += deliver(di, pCopy, dCopy);
        }
        return count;
    }

}

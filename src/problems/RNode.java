package problems;

import java.util.ArrayList;
import java.util.List;

class RNode {
    int val;
    Node next;
    Node random;

    public RNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
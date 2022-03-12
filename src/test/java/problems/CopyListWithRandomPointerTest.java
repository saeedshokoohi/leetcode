package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CopyListWithRandomPointerTest {
    @Test
    public void testCopyRandomList() {
        CopyListWithRandomPointer copyListWithRandomPointer = new CopyListWithRandomPointer();
        CopyListWithRandomPointer.Node root=new CopyListWithRandomPointer.Node(0);
        CopyListWithRandomPointer.Node n1=new CopyListWithRandomPointer.Node(1);
        root.next=n1;
        n1.random=root;
        copyListWithRandomPointer.copyRandomList(root);


    }


}


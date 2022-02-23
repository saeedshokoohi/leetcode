package problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CloneGraphTest {
    @Test
    public void cloneNodeTest()
    {
        //given
        CloneGraph testClass=new CloneGraph();
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n1=new Node(1);
        n1.neighbors=List.of(n2,n4);
        n2.neighbors= List.of(n1,n3);
        n3.neighbors= List.of(n2,n4,n5);
        n4.neighbors= List.of(n1,n3,n5);
        //when
        Node clonedn1=testClass.cloneGraph(n1);
        //then
        assertEquals(n1.val,clonedn1.val);
        assertNotEquals(n1,clonedn1);
        assertEquals(n1.neighbors.size(),clonedn1.neighbors.size());

    }
    @Test
    public void cloneNodeTestNull()
    {
        //given
        CloneGraph testClass=new CloneGraph();
        Node n1=new Node(1);
        //when
        Node clonedn1=testClass.cloneGraph(n1);
        //then
        assertEquals(n1.val,clonedn1.val);
        assertNotEquals(n1,clonedn1);

    }
    @Test
    public void cloneNodeTestEmpty()
    {
        //given
        CloneGraph testClass=new CloneGraph();

        //when
        Node clonedn1=testClass.cloneGraph(null);
        //then
        assertNull(clonedn1);

    }

}

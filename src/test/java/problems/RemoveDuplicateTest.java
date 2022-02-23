package problems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicateTest {
    @Test
    public void testRemoveDuplicates() {
         RemoveDuplicate testClass=new RemoveDuplicate();
        int[] test1=new int[]{1,1,1,2,2,3};
        int[] test2=new int[]{1,1,3};
        int[] test3=new int[]{1,1,3,3};
        int[] test4=new int[]{1};
        //
        int count1=testClass.removeDuplicates(test1);
        int count2=testClass.removeDuplicates(test2);
        int count3=testClass.removeDuplicates(test3);
        int count4=testClass.removeDuplicates(test4);

        //then
        assertEquals(5,count1);
        assertEquals(3,count2);
        assertEquals(4,count3);
        assertEquals(1,count4);
        assertArrayEquals(new int[]{1,1,2,2,3}, Arrays.copyOf(test1,count1));
        assertArrayEquals(new int[]{1,1,3}, Arrays.copyOf(test2,count2));
        assertArrayEquals(new int[]{1,1,3,3}, Arrays.copyOf(test3,count3));
        assertArrayEquals(new int[]{1}, Arrays.copyOf(test4,count4));


    }
}


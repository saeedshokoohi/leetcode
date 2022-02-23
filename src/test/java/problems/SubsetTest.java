package problems;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SubsetTest {
    @Test
    public void testSubsets() {
        //given
        Subset testClass=new Subset();
        int[] array1=new int[]{1, 2, 3};
        int[] array2=new int[]{1, 2, 3,4};
        //when
        List<List<Integer>> subset1 = testClass.subsets(array1);
        List<List<Integer>> subset2 = testClass.subsets(array2);
        //then
        assertEquals(8,subset1.size() );
        assertEquals(16,subset2.size() );
    }


}


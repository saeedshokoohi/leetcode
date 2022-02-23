package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimizeDeviationInArrayTest {

    @Test
    public  void minimumDeviationTest()
    {
        MinimizeDeviationInArray testClass=new MinimizeDeviationInArray();
        assertEquals(315,testClass.minimumDeviation(new int[]{399,908,648,357,693,502,331,649,596,698}));
        assertEquals(1,testClass.minimumDeviation(new int[]{5,3}));
        assertEquals(2,testClass.minimumDeviation(new int[]{10,4,3}));
        assertEquals(1,testClass.minimumDeviation(new int[]{2,8,6,1,6}));
        assertEquals(1,testClass.minimumDeviation(new int[]{2,3,1,4}));
        assertEquals(3,testClass.minimumDeviation(new int[]{4,1,5,20,3}));
        assertEquals(3,testClass.minimumDeviation(new int[]{2,10,8}));

    }

}

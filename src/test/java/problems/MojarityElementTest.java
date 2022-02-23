package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MojarityElementTest {
    @Test
    public void majorityElementTest()
    {
        MajorityElement testClass=new MajorityElement();
        assertEquals(3,testClass.majorityElement(new int[]{3,2,3}));
        assertEquals(2,testClass.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}

package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {
    @Test
    public void titleToNumberTest()
    {
        ExcelSheetColumnNumber testClass=new ExcelSheetColumnNumber();
        assertEquals(27, testClass.titleToNumber("AA"));
        assertEquals(1, testClass.titleToNumber("A"));
        assertEquals(701, testClass.titleToNumber("ZY"));

    }
}

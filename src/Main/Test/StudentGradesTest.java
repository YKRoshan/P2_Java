import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StudentGradesTest {
    StudentGrades obj ;
   int [] arr = {66,72,83,64,75};
    @Before
    public void setUp() {
        obj = new StudentGrades();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void testMaximum()
    {
        int expected =83;
        int actual = obj.maximum(arr,5);
        assertEquals(expected,actual);
    }

    @Test
    public void testMinimum()
    {
        int expected =64;
        int actual = obj.minimum(arr,5);
        assertEquals(expected,actual);
    }

    @Test
    public void testAverage()
    {
        double expected =72;
        double actual = obj.average(arr,5);
        assertEquals(expected,actual,0);
    }
}

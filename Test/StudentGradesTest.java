import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentGradesTest {
    StudentGrades obj ;
   int []a=new int[]{1,2,3,4,5};
    @Before
    public void setUp() {
        obj = new StudentGrades();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void testAverage()
    {

    }

    @Test
    public void testMaximum()
    {
        double expected =12;
        double actual = maximum(a);
       // assertEquals(12,obj.Maximum(a));
        assertEqual(expected,actual);
    }

    @Test
    public void testMinimum()
    {
        assert.equals(12,obj.Maximum(a));
    }
}

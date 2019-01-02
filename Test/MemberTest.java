import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MemberTest {
    Member obj ;
    @Before
    public void setUp() {
        obj = new Member();
    }

    @After
    public void tearDown() {

        obj = null;
    }

    @Test
    public void testName()
    {

        assertEquals(expected,actual);
    }

    @Test
    public void testAge()
    {

        assertEquals(expected,actual);
    }

    @Test
    public void testSalary()
    {

        assertEquals(expected,actual);
    }

}

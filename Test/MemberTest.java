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
        obj.setName("Rahul");
        String actual = obj.getName();
        String expected = "Rahul"
        assertEquals(expected,actual);
    }

    @Test
    public void testAge()
    {
        obj.setAge(22);
        int actual = obj.getAge();
        int expected = 22;
        assertEquals(expected,actual);
    }

    @Test
    public void testSalary()
    {
        obj.setSalary(10000);
        int actual = getSalary();
        int expected = 10000;
        assertEquals(expected,actual);
    }

}

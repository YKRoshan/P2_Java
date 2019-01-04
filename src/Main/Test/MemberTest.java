import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MemberTest {
    Member member ;
    @Before
    public void setUp() {

        member = new Member();
    }

    @After
    public void tearDown() {

        member = null;
    }

    @Test
    public void testName()
    {
        member.setName("Rahul");
        String actual = member.getName();
        String expected = "Rahul";
        assertEquals(expected,actual);
    }

    @Test
    public void testAge()
    {
        member.setAge(22);
        int actual = member.getAge();
        int expected = 22;
        assertEquals(expected,actual,0);
    }

    @Test
    public void testSalary()
    {
        member.setSalary(10000);
        double actual = member.getSalary();
        double expected = 10000;
        assertEquals(expected,actual,0);
    }

}

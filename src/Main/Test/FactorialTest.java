import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class FactorialTest {
    Factorial obj;
    @Before
    public void setUp() throws Exception {

        obj = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void factorial_sucess_1() {
        long expected = 720;
        long actual = obj.factorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void factorial_sucess_2() {
        long expected = 479001600;
        long actual = obj.factorial(12);
        assertEquals(expected, actual);
    }

    @Test
    public void factorial_sucess_3() {
        long expected = 0;
        long actual = obj.factorial(22);
        assertEquals(expected, actual);
    }
}

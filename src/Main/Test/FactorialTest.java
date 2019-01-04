import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class FactorialTest {
    Factorial fact;
    @Before
    public void setUp() throws Exception {

        fact = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact = null;
    }

    @Test
    public void factorial_sucess_1() {
        long expected = 720;
        long actual = fact.factorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void factorial_sucess_2() {
        long expected = 479001600;
        long actual = fact.factorial(12);
        assertEquals(expected, actual);
    }

    @Test
    public void factorial_sucess_3() {
        long expected = 0;
        long actual = fact.factorial(22);
        assertEquals(expected, actual);
    }
}

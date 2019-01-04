import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckPowerOfFourTest {

    CheckPowerOfFour checkPowerOfFour ;
    @Before
    public void setUp() {
        checkPowerOfFour = new CheckPowerOfFour();
    }

    @After
    public void tearDown() {

        checkPowerOfFour = null;
    }

    @Test
    public void testSuccess()
    {
        boolean actual =  checkPowerOfFour.checkPowerOfFour(64);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void testFail()
    {
        boolean actual =  checkPowerOfFour.checkPowerOfFour(122);
        boolean expected = false;
        assertEquals(expected,actual);
    }

}

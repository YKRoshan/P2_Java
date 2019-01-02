import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PelindromeTest {
    Pelindrome obj;
    @Before
    public void setUp()
    {
        obj = new Pelindrome();
    }

    @After
    public void tearDown()
    {
        obj = null;
    }

    @Test
    public void reverseSuccess_1()
    {
       int actual =  pelindrome(121);
       int expected = 121;
        assertEquals(expected,actual);
    }

    @Test
    public void reverseSuccess_2()
    {
        int actual =  pelindrome(235542);
        int expected = 245532;
        assertEquals(expected,actual);
    }

    @Test
    public void pelindromeSuccess()
    {
        boolean actual =  pelindrome(121);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    public void pelindromeFail()
    {
        boolean actual =  pelindrome(235542);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}

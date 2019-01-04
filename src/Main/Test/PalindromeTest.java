import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() {

        palindrome = new Palindrome();
    }

    @After
    public void tearDown()
    {
        palindrome = null;
    }

    @Test
    public void reverseSuccess_1()
    {
       int actual =  palindrome.reverse(121);
       int expected = 121;
        assertEquals(expected,actual);
    }

    @Test
    public void reverseSuccess_2()
    {
        int actual =  palindrome.reverse(235542);
        int expected = 245532;
        assertEquals(expected,actual);
    }

    @Test
    public void palindromeSuccess()
    {
        boolean actual =  palindrome.palindrome(121);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    public void palindromeFail()
    {
        boolean actual =  palindrome.palindrome(235542);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}

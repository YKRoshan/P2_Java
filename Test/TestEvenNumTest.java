import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestEvenNumTest {


    @Test
    public void testSuccess_1()
    {
        boolean actual = EvenNumTest.isEven(24);
        boolean expected =true;
        assertEquals(expected,actual);
    }

    @Test
    public void testFail()
    {
        boolean actual = EvenNumTest.isEven(123);
        boolean expected =false;
        assertEquals(expected,actual);
    }
}

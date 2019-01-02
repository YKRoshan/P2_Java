public class FactorialTest {
    Factorial objj;
    @Before
    public void setUp() throws Exception {

        obj = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test    public void factorial_sucess_1() {
        long expected = 720;
        long actual = obj.factorial(6);
        assertEquals(expected, actual);
    }
    public void factorial_sucess_2() {
        long expected = 479001600;
        long actual = obj.factorial(12);
        assertEquals(expected, actual);
    }
    @Test
    public void factorial_sucess_3() {
        long expected = 323454657768;
        long actual = obj.factorial(22);
        assertNotEquals(expected, actual);
    }
}

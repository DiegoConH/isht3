import org.junit.*;

import static org.junit.Assert.*;

public class palindromostest {
    public palindromostest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void simpleInput_normalOutput() {
        System.out.println("TEST #1 - whenBasicInput_thenBasicOutput");

        // given
        String input = "anita";
        Boolean expectedResult = true;

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #1 FAILED!!!",actualResult instanceof Boolean, expectedResult);
    }

    @Test
    public void nullInput_nullOutput(){
        System.out.println("TEST #2 - nullInput_nullOutput");

        // given
        String input = null;
        String expectedResult = null;

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #2 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void emptyInput_emptyOutput(){
        System.out.println("TEST #3 - emptyInput_emptyOutput");

        // given
        String input = "";
        String expectedResult = "";

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #3 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void tooShortInput_tooShortOutput(){
        System.out.println("TEST #4 - tooShortInput_tooShortOutput");

        // given
        String input = "gm";
        String expectedResult = "gm";

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #4 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void withSpacesInput_emptyOutput(){
        System.out.println("TEST #5 - withSpacesInput_emptyOutput");

        // given
        String input = "bub ";
        String expectedResult = "";

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #5 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void tooLongInput_emptyOutput(){
        System.out.println("TEST #6 - tooLongInput_emptyOutput");

        // given
        String input = "adfafhfajdhfakdhkadfkladhalkdjhkjadshfkjadshfkajsdhfuiackjsdhfljaksdhcjasdjfbajdhfalkdjhfakjsdfhsbajdfhabskdjfuasdjksdflaksdhfaldfhadjfhadsjfakjdfiqoruycbsjhgfvzjhgfjkadjfauuyraksdjfhsk";
        String expectedResult = "";

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #6 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void nonOnlyLettersNumbersInput_messageOutput(){
        System.out.println("TEST #7 - nonOnlyLettersNumbersInput_messageOutput");

        // given
        String input = "anita.";
        String expectedResult = "unicamente letras o numeros";

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #7 FAILED!!!",actualResult, expectedResult);
    }

    @Test
    public void parLengthInput_zeroOutput(){
        System.out.println("TEST #8 - parLengthInput_zeroOutput");

        // given
        String input = "anitan";
        int expectedResult = 0;

        // when
        Object actualResult = palindromos.evaluate(input);

        // then
        assertEquals("Test #7 FAILED!!!",actualResult, expectedResult);
    }
}
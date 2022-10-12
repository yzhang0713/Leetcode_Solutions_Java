import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class RomanToIntegerTest {

    private static RomanToInteger romanToInteger;

    @BeforeAll
    public static void setup() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void testEmpty() {
        String romanInteger = "";
        Assertions.assertEquals(0, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(0, romanToInteger.romanToIntWithSwitch(romanInteger));
    }

    @Test
    public void testSingleDigit() {
        // Test 3
        String romanInteger = "III";
        Assertions.assertEquals(3, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(3, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 4
        romanInteger = "IV";
        Assertions.assertEquals(4, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(4, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 8
        romanInteger = "VIII";
        Assertions.assertEquals(8, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(8, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 9
        romanInteger = "IX";
        Assertions.assertEquals(9, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(9, romanToInteger.romanToIntWithSwitch(romanInteger));
    }

    @Test
    public void testTwoDigits() {
        // Test 33
        String romanInteger = "XXXIII";
        Assertions.assertEquals(33, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(33, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 44
        romanInteger = "XLIV";
        Assertions.assertEquals(44, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(44, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 88
        romanInteger = "LXXXVIII";
        Assertions.assertEquals(88, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(88, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 99
        romanInteger = "XCIX";
        Assertions.assertEquals(99, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(99, romanToInteger.romanToIntWithSwitch(romanInteger));
    }

    @Test
    public void testThreeDigits() {
        // Test 333
        String romanInteger = "CCCXXXIII";
        Assertions.assertEquals(333, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(333, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 444
        romanInteger = "CDXLIV";
        Assertions.assertEquals(444, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(444, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 888
        romanInteger = "DCCCLXXXVIII";
        Assertions.assertEquals(888, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(888, romanToInteger.romanToIntWithSwitch(romanInteger));
        // Test 999
        romanInteger = "CMXCIX";
        Assertions.assertEquals(999, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(999, romanToInteger.romanToIntWithSwitch(romanInteger));
    }

    @Test
    public void testFourDigits() {
        // Test 3999
        String romanInteger = "MMMCMXCIX";
        Assertions.assertEquals(3999, romanToInteger.romanToInt(romanInteger));
        Assertions.assertEquals(3999, romanToInteger.romanToIntWithSwitch(romanInteger));
    }
}
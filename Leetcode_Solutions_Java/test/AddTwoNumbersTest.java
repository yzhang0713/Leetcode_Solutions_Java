import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private static AddTwoNumbers addTwoNumbers;

    @BeforeAll
    public static void setup() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void testAddTwoNumbers() {
        Assertions.assertEquals("[7,3,2]", addTwoNumbers.addTwoNumbersTestHelper(123, 114));
        Assertions.assertEquals("[8,4,3,1]", addTwoNumbers.addTwoNumbersTestHelper(1234, 114));
        Assertions.assertEquals("[5,1,1]", addTwoNumbers.addTwoNumbersTestHelper(1, 114));
        Assertions.assertEquals("[0,4,0,1]", addTwoNumbers.addTwoNumbersTestHelper(926, 114));
    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarPoolingTest {

    private static CarPooling carPooling;

    @BeforeAll
    public static void setup() {
        carPooling = new CarPooling();
    }

    @Test
    public void testNoPassenger() {
        int[][] passengerInfos = new int[][]{};
        int capacity = 1;
        Assertions.assertTrue(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testPerfectDrop() {
        int[][] passengerInfos = {{2,1,2}, {2,2,3}, {2,3,4}};
        int capacity = 2;
        Assertions.assertTrue(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testSimpleFail() {
        int[][] passengerInfos = {{5,1,2}};
        int capacity = 2;
        Assertions.assertFalse(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testMultiplePassengerSuccess() {
        int[][] passengerInfos = {{2,1,10}, {3,2,4}, {2,5,13}, {1,7,10}, {3,12,15}};
        int capacity = 5;
        Assertions.assertTrue(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testMultiplePassengerNotInOrderSuccess() {
        int[][] passengerInfos = {{1,7,10}, {2,1,10}, {3,12,15}, {3,2,4}, {2,5,13}};
        int capacity = 5;
        Assertions.assertTrue(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testMultiplePassengerFail() {
        int[][] passengerInfos = {{2,1,10}, {3,2,4}, {3,5,13}, {1,7,10}, {3,12,15}};
        int capacity = 5;
        Assertions.assertFalse(carPooling.carPooling(passengerInfos, capacity));
    }

    @Test
    public void testMultiplePassengerNotInOrderFail() {
        int[][] passengerInfos = {{1,7,10}, {2,1,10}, {3,12,15}, {3,2,4}, {3,5,13}};
        int capacity = 5;
        Assertions.assertFalse(carPooling.carPooling(passengerInfos, capacity));
    }

}
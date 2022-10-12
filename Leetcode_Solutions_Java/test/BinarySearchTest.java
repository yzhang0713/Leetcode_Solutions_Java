import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    public static BinarySearch binarySearch;
    public static int[] numbers;

    @BeforeAll
    public static void setup() {
        binarySearch = new BinarySearch();
        numbers = new int[]{-1, 0, 3, 5, 9, 12};
    }

    @Test
    public void testSmallerThanLowerBound() {
        int valueToSearch = -2;
        Assertions.assertEquals(-1, binarySearch.search(numbers, valueToSearch));
    }

    @Test
    public void testLargerThanUpperBound() {
        int valueToSearch = 15;
        Assertions.assertEquals(-1, binarySearch.search(numbers, valueToSearch));
    }

    @Test
    public void testNotFound() {
        int valueToSearch = 2;
        Assertions.assertEquals(-1, binarySearch.search(numbers, valueToSearch));
    }

    @Test
    public void testFirstElement() {
        int valueToSearch = -1;
        Assertions.assertEquals(0, binarySearch.search(numbers, valueToSearch));
    }

    @Test
    public void testLastElement() {
        int valueToSearch = 12;
        Assertions.assertEquals(5, binarySearch.search(numbers, valueToSearch));
    }

    @Test
    public void testMiddleElement() {
        int valueToSearch = 3;
        Assertions.assertEquals(2, binarySearch.search(numbers, valueToSearch));
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private static TwoSum twoSum;

    @BeforeAll
    public static void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void testEdgeCase() {
        int[] nums = new int[]{3,3};
        Assertions.assertArrayEquals(new int[]{0,1}, twoSum.twoSum(nums, 6));
    }

    @Test
    public void testNormalCase() {
        int[] nums = new int[]{2,7,11,15};
        Assertions.assertArrayEquals(new int[]{0,3}, twoSum.twoSum(nums, 17));
    }

}
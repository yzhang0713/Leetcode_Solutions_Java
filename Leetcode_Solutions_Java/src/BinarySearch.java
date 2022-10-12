/**
 * Problem 704. Binary Search
 */
public class BinarySearch {

    private boolean debug = false;
    public BinarySearch() {

    }

    public BinarySearch(boolean debug) {
        this.debug = debug;
    }

    public int search(int[] nums, int target) {
        int nNumber = nums.length;
        // In case target is smaller than lower bound or larger than upper bound, return -1
        if (target < nums[0] || target > nums[nNumber-1]) {
            return -1;
        }
        // Define the two pointers to track first and last element
        int startPointer = 0;
        int endPointer = nNumber - 1;
        // Middle pointer
        int middlePointer = (startPointer + endPointer) / 2;
        while (startPointer <= endPointer) {
            if (debug) {
                System.out.println(String.format("Start pointer: %d, end pointer: %d, middle pointer: %d", startPointer, endPointer, middlePointer));
            }
            if (target == nums[middlePointer]) {
                return middlePointer;
            }
            if (target > nums[middlePointer]) {
                startPointer = middlePointer + 1;
                middlePointer = (startPointer + endPointer) / 2;
                continue;
            }
            endPointer = middlePointer - 1;
            middlePointer = (startPointer + endPointer) / 2;
        }
        return -1;
    }
}

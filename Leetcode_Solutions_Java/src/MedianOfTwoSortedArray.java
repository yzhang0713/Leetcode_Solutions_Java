/**
 * Problem 4. Median Of Two Sorted Array
 */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numberBeforeMedian = (nums1.length + nums2.length - 1) / 2;
        // Edge cases
        // Case 1. Everything from one list is in front of the cutoff point
        if (nums1.length == 0 || (numberBeforeMedian >= nums1.length && nums2[numberBeforeMedian-nums1.length] > nums1[nums1.length-1])) {
            return oneArrayFullyBeforeMedian(nums2, nums1.length, numberBeforeMedian);
        }
        if (nums2.length == 0 || (numberBeforeMedian >= nums2.length && nums1[numberBeforeMedian-nums2.length] > nums2[nums2.length-1])) {
            return oneArrayFullyBeforeMedian(nums1, nums2.length, numberBeforeMedian);
        }
        // Case 2. Everything from one list is after the cutoff point
        if (nums1.length > numberBeforeMedian + 2 && nums1[numberBeforeMedian+1] < nums2[0]) {
            return oneArrayFullyAfterMedian(nums1, nums2.length, numberBeforeMedian);
        }
        if (nums2.length > numberBeforeMedian + 2 && nums2[numberBeforeMedian+1] < nums1[0]) {
            return oneArrayFullyAfterMedian(nums2, nums1.length, numberBeforeMedian);
        }
        // Case 3. One array completely smaller than the other
        if (nums1[0] >= nums2[nums2.length-1]) {
            return OneArrayCompletelySmaller(nums1, nums2, numberBeforeMedian);
        }
        if (nums2[0] >= nums1[nums1.length-1]) {
            return OneArrayCompletelySmaller(nums2, nums1, numberBeforeMedian);
        }

        // Otherwise, start searching recursively with two sets of pointers
        return findMedianSortedArraysRecursion(nums1, nums2, 0, nums1.length-1, 0, nums2.length-1, numberBeforeMedian);

    }

    public double oneArrayFullyBeforeMedian(int[] nums, int otherArrayLength, int numberBeforeMedian) {
        if ((nums.length + otherArrayLength) % 2 != 0) {
            return nums[numberBeforeMedian - otherArrayLength];
        }
        return (nums[numberBeforeMedian - otherArrayLength] + nums[numberBeforeMedian - otherArrayLength + 1]) / 2.0;
    }

    public double oneArrayFullyAfterMedian(int[] nums, int otherArrayLength, int numberBeforeMedian) {
        if ((nums.length + otherArrayLength) % 2 != 0) {
            return nums[numberBeforeMedian];
        }
        return (nums[numberBeforeMedian] + nums[numberBeforeMedian + 1]) / 2.0;
    }

    public double OneArrayCompletelySmaller(int[] nums1, int[] nums2, int numberBeforeMedian) {
        if ((nums1.length + nums2.length)%2 != 0) {
            return nums2.length > numberBeforeMedian ? nums2[numberBeforeMedian] : nums1[numberBeforeMedian - nums2.length];
        } else {
            return ((nums2.length > numberBeforeMedian ? nums2[numberBeforeMedian] : nums1[numberBeforeMedian - nums2.length])
                    + (nums2.length > numberBeforeMedian + 1 ? nums2[numberBeforeMedian + 1] : nums1[numberBeforeMedian + 1 - nums2.length])) / 2.0;
        }
    }

    public double findMedianSortedArraysRecursion(int[] nums1, int[] nums2, int startPointer1, int endPointer1, int startPointer2, int endPointer2, int numberBeforeMedian) {
        int numsPointer1 = (startPointer1 + endPointer1) / 2;
        int numsPointer2 = numberBeforeMedian - numsPointer1;
        if (numsPointer2 < startPointer2) {
            numsPointer2 = startPointer2;
            numsPointer1 = numberBeforeMedian - numsPointer2;
        }
        if (numsPointer2 > endPointer2) {
            numsPointer2 = endPointer2;
            numsPointer1 = numberBeforeMedian - numsPointer2;
        }
        if ((numsPointer1 == 0 || (numsPointer1 > 0 && nums2[numsPointer2] >= nums1[numsPointer1-1])) &&
                (numsPointer2 == 0 || (numsPointer2 > 0 && nums1[numsPointer1] >= nums2[numsPointer2-1]))) {
            if ((nums1.length + nums2.length) % 2 == 1) {
                return Math.min(nums1[numsPointer1], nums2[numsPointer2]);
            } else {
                if (nums1[numsPointer1] < nums2[numsPointer2]) {
                    if (numsPointer1 == nums1.length-1) {
                        return (nums1[numsPointer1] + nums2[numsPointer2]) / 2.0;
                    }
                    return (nums1[numsPointer1] + Math.min(nums2[numsPointer2], nums1[numsPointer1+1])) / 2.0;
                } else {
                    if (numsPointer2 == nums2.length-1) {
                        return (nums2[numsPointer2] + nums1[numsPointer1]) / 2.0;
                    }
                    return (nums2[numsPointer2] + Math.min(nums1[numsPointer1], nums2[numsPointer2+1])) / 2.0;
                }
            }
        }
        if (nums1[numsPointer1] < nums2[numsPointer2]) {
            return findMedianSortedArraysRecursion(nums1, nums2, numsPointer1+1, endPointer1, startPointer2, numsPointer2-1, numberBeforeMedian);
        } else {
            return findMedianSortedArraysRecursion(nums1, nums2, startPointer1, numsPointer1-1, numsPointer2+1, endPointer2, numberBeforeMedian);
        }
    }
}

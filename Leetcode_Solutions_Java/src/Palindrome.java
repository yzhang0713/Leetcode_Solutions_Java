public class Palindrome {

    public static boolean isPalindrome(String s) {
        String sLower = s.toLowerCase();
        int startPointer = 0;
        int endPointer = s.length()-1;
        while (startPointer < endPointer) {
            while (sLower.charAt(startPointer) == ' ') {
                startPointer++;
            }
            while (sLower.charAt(endPointer) == ' ') {
                endPointer--;
            }
            if (sLower.charAt(startPointer) != sLower.charAt(endPointer)) {
                return false;
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        return isPalindromeRecursive(s.substring(1, s.length()-1));
    }

    public static String findLongestSubSequence(String s) {
        int maxSubSequence = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        int startIndex = 0;
        int endIndex = 0;
        while (endIndex <= s.length()) {
            if (endIndex == s.length() || s.charAt(startIndex) != s.charAt(endIndex)) {
                if (endIndex - startIndex > maxSubSequence) {
                    maxStartIndex = startIndex;
                    maxEndIndex = endIndex;
                    maxSubSequence = endIndex - startIndex;
                }
                startIndex = endIndex;
            }
            endIndex++;
        }
        return s.substring(maxStartIndex, maxEndIndex);
    }


}

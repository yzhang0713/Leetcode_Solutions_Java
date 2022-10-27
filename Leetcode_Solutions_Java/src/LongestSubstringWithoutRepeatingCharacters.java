import java.util.HashMap;
import java.util.Map;
/**
 * Problem 3. Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charPosition = new HashMap<>();
        int maxLength = 0;
        int startCounting = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charPosition.containsKey(c)) {
                startCounting = Math.max(charPosition.get(c) + 1, startCounting);
            }
            maxLength = Math.max(maxLength, i - startCounting + 1);
            charPosition.put(c, i);
        }
        return maxLength;
    }
}

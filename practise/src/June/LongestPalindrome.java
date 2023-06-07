package June;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    /**
     * 最长回文串
     * 给定一个包含大写字母和小写字母的字符串s，返回通过这些字母构造成的 最长的回文串。
     * 在构造过程中，请注意 区分大小写 。比如"Aa"不能当做一个回文字符串。
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Integer value = entry.getValue();
            count = count + value / 2 * 2;
        }
        if (count < s.length())
            count++;
        return count;
    }
}

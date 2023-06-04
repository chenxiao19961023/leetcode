package June;


import java.util.LinkedHashMap;
import java.util.Map;


public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    /**
     * 字符串中的第一个唯一字符
     * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}

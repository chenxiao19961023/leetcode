package June;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    /**
     * 单词规律
     * 给定一种规律 pattern和一个字符串s，判断 s是否遵循相同的规律。
     * 这里的遵循指完全匹配，例如，pattern里的每个字母和字符串s中的每个非空单词之间存在着双向连接的对应规律。
     * @param pattern
     * @param s
     * @return
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (strings.length != pattern.length()) return false;
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                if (map.get(strings[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else if (map.containsValue(pattern.charAt(i))) {
                return false;
            }
            map.put(strings[i],pattern.charAt(i));
        }
        return true;
    }
}

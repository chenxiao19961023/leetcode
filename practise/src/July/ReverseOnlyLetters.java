package July;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "?6C40E";
        System.out.println(reverseOnlyLetters(s));
    }

    /**
     *  仅仅反转字母
     *  给你一个字符串 s ，根据下述规则反转字符串：
     * 所有非英文字母保留在原有位置。
     * 所有英文字母（小写或大写）位置反转。
     * 返回反转后的 s 。
     * @param s
     * @return
     */
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int before = 0;
        int after = chars.length - 1;
        char tem = ' ';
        while (before < after) {
            while (before < s.length()&&!(chars[before] >= 'a' && chars[before] <= 'z' || chars[before] >= 'A' && chars[before] <= 'Z')) {
                before++;
            }
            if (before == chars.length) break;
            while (after > before && !(chars[after] >= 'a' && chars[after] <= 'z' || chars[after] >= 'A' && chars[after] <= 'Z')) {
                after--;
            }
            if (before >= after) break;
            tem = chars[before];
            chars[before] = chars[after];
            chars[after] = tem;
            before++;
            after--;
        }
        return new String(chars);
    }
}

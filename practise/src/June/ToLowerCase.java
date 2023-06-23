package June;


public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    /**
     * 转换成小写字母
     * 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
     *
     * @param s
     * @return
     */
    public static String toLowerCase(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                a += (char) (s.charAt(i) + 32);
            } else {
                a += s.charAt(i);
            }
        }
        return a;
    }
}

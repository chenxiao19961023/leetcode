package June;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "asd";
        String t = "asde";
        System.out.println(findTheDifference(s, t));
    }

    /**
     * 找不同
     * 给定两个字符串 s 和 t ，它们只包含小写字母。
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     * 请找出在 t 中被添加的字母。
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            res ^= t.charAt(i);
        }
        return (char) res;
    }

    public static char findTheDifference1(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }
        return (char) sum;
    }
}

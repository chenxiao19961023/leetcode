package June;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }

    /**
     * 重复的子字符串
     * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
     * @param s
     * @return
     */
    public static boolean repeatedSubstringPattern(String s) {
        String tem;
        String str;
        int count = 0;
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                tem = s.substring(0, i);
                for (int j = 0; j < s.length() / i; j++) {
                    str = s.substring(j * i, j * i + i);
                    if (!tem.equals(str)) {
                        break;
                    } else count++;
                }
                if (count == s.length()/i) return true;
                count = 0;
            }
        }
        return false;
    }
}

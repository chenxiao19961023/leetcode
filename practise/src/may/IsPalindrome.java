package may;

public class IsPalindrome {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "race a car";
        String c = "0P";

        System.out.println(isPalindrome(c));
    }

    /**
     * 验证回文串
     * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
     * 字母和数字都属于字母数字字符。
     * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'||s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                str += s.charAt(i);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                str += (char) (s.charAt(i) + 32);
            }
        }
        if (str.length()==0||str.length()==1) return true;
        String leftStr = "";
        String rightStr = "";
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            leftStr += str.charAt(left++);
            rightStr += str.charAt(right--);
        }
        return leftStr.equals(rightStr);
    }
}

package Aug;

public class MaxPower {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }

    /**
     * 连续字符
     * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
     * 请你返回字符串 s 的 能量。
     * @param s
     * @return
     */
    public static int maxPower(String s) {
        int fast = 1;
        int slow = 0;
        int result = 1;
        while (fast < s.length()) {
            if (s.charAt(slow) == s.charAt(fast)) {
                fast++;
                if (fast - slow > result) {
                    result = fast - slow;
                }
            } else {
                slow = fast;
                fast++;
            }
        }
        return result;
    }
}

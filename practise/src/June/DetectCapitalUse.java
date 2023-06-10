package June;


public class DetectCapitalUse {
    public static void main(String[] args) {
        String s = "aaaaF";
        System.out.println(detectCapitalUse(s));
    }

    /**
     * 检测大写字母
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     * 全部字母都是大写，比如 "USA" 。
     * 单词中所有字母都不是大写，比如 "leetcode" 。
     * 如果单词不只含有一个字母，只有首字母大写，比如"Google" 。
     * 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
     * @param s
     * @return
     */
    public static boolean detectCapitalUse(String s) {
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first >= 'a' && first <= 'z' || first >= 'A' && first <= 'Z' && last >= 'a' && last <= 'z') {
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    return false;
            }
        }
        if (first >= 'A' && first <= 'Z' && last >= 'A' && last <= 'Z') {
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    return false;
            }
        }
        if (first >= 'a' && first <= 'z' && last >= 'A' && last <= 'Z') return false;
        return true;
    }
}

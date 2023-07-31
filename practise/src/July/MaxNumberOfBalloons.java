package July;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        String text = "leetcode";
        System.out.println(maxNumberOfBalloons(text));
    }

    /**
     * “气球” 的最大数量
     * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
     * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
     * @param text
     * @return
     */
    public static int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        int count = 0;
        int t = 0;
        int m = 0;
        char[] tem = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        for (int i = 0; i < text.length(); i++) {
            chars[text.charAt(i) - 97]++;
        }
        while (true) {
            for (int i = 0; i < tem.length; i++) {
                t = --chars[tem[i] - 97];
                if (t < 0) break;
                m++;
            }
            if (m == tem.length){
                count++;
                m = 0;
            } else break;
        }
        return count;
    }
}

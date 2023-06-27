package June;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord(licensePlate, words));

    }

    /**
     * 最短补全词
     * 给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出words 中的 最短补全词 。
     * 补全词 是一个包含 licensePlate 中所有字母的单词。忽略licensePlate 中的 数字和空格 。不区分大小写。如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
     * 例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
     * 请返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 第一个 出现的那个。
     *
     * @param licensePlate
     * @param words
     * @return
     */

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String res = null;
        String temp = "";
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z') {
                temp += (char) (licensePlate.charAt(i) + 32);
            } else if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
                temp += licensePlate.charAt(i);
            }
        }
        for (int i = words.length - 1; i >= 0; i--) {
            boolean b = containsAllChars(words[i], temp);
            if (b) {
                if (words[i].length() <= count) {
                    res = words[i];
                    count = words[i].length();
                }
            }
        }
        return res;
    }

    public static boolean containsAllChars(String target, String match) {
        int[] counts = new int[123];
        for (char c : target.toCharArray()) {
            counts[c]++;
        }
        for (char c : match.toCharArray()) {
            counts[c]--;
            if (counts[c] < 0) {
                return false;
            }
        }
        return true;
    }
}

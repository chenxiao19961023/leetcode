package Aug;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        System.out.println(stringMatching(words));
    }


    /**
     * 数组中的字符串匹配
     * 给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按 任意 顺序返回 words 中是其他单词的子字符串的所有单词。
     * 如果你可以删除 words[j] 最左侧和/或最右侧的若干字符得到 words[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串。
     * @param words
     * @return
     */
    public static List<String> stringMatching(String[] words) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while (i < words.length) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    boolean match = match(words[i], words[j]);
                    if (match) {
                        if (!list.contains(words[i])){
                            list.add(words[i]);
                        }
                    }
                }
            }
            i++;
        }
        return list;
    }

    public static boolean match(String s1, String s2) {
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (s2.charAt(i)==s1.charAt(0)){
                String substring = s2.substring(i, i + s1.length());
                if (substring.equals(s1)){
                    return true;
                }
            }
        }
        return false;
    }
}

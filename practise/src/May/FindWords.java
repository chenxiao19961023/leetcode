package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));

    }

    /**
     * 键盘行
     * 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词
     * 第一行由字符 "qwertyuiop" 组成。
     * 第二行由字符 "asdfghjkl" 组成。
     * 第三行由字符 "zxcvbnm" 组成。
     * @param words
     * @return
     */
    public static String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                if (s1.contains(word.charAt(i) + "")) {
                    n1++;
                } else if (s2.contains(word.charAt(i) + "")) {
                    n2++;
                } else if (s3.contains(word.charAt(i) + "")) {
                    n3++;
                }
            }
            if (n1 == len || n2 == len || n3 == len) {
                list.add(word);
            }
        }
        String[] str = new String[list.size()];
        int n = 0;
        for (String s : list) {
            str[n++] = s;
        }
        return str;
    }
}

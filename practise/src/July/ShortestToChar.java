package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestToChar {
    public static void main(String[] args) {
        String s = "aaab";
        char c = 'b';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

    /**
     * 字符的最短距离
     * 给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。
     * 返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。
     * 两个下标i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。
     * @param s
     * @param c
     * @return
     */
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                list.add(i);
            }
        }
        int min = s.length();
        for (int i = 0; i < chars.length; i++) {
            for (Integer integer : list) {
                if (Math.abs(i - integer) < min){
                    min = Math.abs(i - integer);
                }
            }
            res[i] = min;
            min = s.length();
        }
        return res;
    }
}

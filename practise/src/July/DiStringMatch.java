package July;

import java.util.ArrayList;
import java.util.Arrays;

public class DiStringMatch {
    public static void main(String[] args) {
        String s = "DDI";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    /**
     * 增减字符串匹配
     * 由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:
     * 如果perm[i] < perm[i + 1]，那么s[i] == 'I'
     * 如果perm[i] > perm[i + 1]，那么 s[i] == 'D'
     * 给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。
     * @param s
     * @return
     */
    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            list.add(i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I'){
                res[i] = list.get(0);
                list.remove(0);
            }else {
                res[i] = list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }
        }
        res[s.length()] = list.get(0);
        return res;
    }
}

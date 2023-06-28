package June;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        System.out.println(mostCommonWord(paragraph, banned));
    }

    /**
     * 最常见的单词
     * 给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
     * 题目保证至少有一个词不在禁用列表中，而且答案唯一。
     * 禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。
     * @param paragraph
     * @param banned
     * @return
     */
    public static String mostCommonWord(String paragraph, String[] banned) {
        List<String> list = new ArrayList<>();
        String tem = "";
        String res = "";
        int count = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) >= 'A' && paragraph.charAt(i) <= 'Z') {
                tem += (char) (paragraph.charAt(i) + 32);
                count++;
            } else if (paragraph.charAt(i) >= 'a' && paragraph.charAt(i) <= 'z') {
                tem += paragraph.charAt(i);
                count++;
            } else {
                if (count != 0) {
                    list.add(tem);
                    tem = "";
                    count = 0;
                }
            }
        }
        if (count != 0) {
            list.add(tem);
        }
        List<String> strings = Arrays.asList(banned);
        list.removeAll(strings);
        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            if (map.get(string) == null) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        Integer max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (max < entry.getValue()){
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}

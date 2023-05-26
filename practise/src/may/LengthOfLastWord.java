package may;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s2));
    }

    /**
     * 最后一个单词的长度
     * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
     * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        List<Character> list = new ArrayList<>();
        for (char aChar : chars) {
            if (aChar!=' '){
                list.add(aChar);
                count=list.size();
            }else {
                list.clear();
            }
        }
        return count;
    }
}

package Aug;

import java.util.ArrayList;
import java.util.List;

public class Reformat {
    public static void main(String[] args) {
        String s = "covid2019";
        System.out.println(reformat1(s));
    }

    /**
     * 重新格式化字符串
     * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
     * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
     * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
     * @param s
     * @return
     */
    public static String reformat(String s) {
        StringBuilder builder = new StringBuilder();
        List<Character> characters = new ArrayList<>();
        List<Character> integers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                integers.add(s.charAt(i));
            } else {
                characters.add(s.charAt(i));
            }
        }
        int characterSize = characters.size();
        int integerSize = integers.size();
        if (characterSize - integerSize > 1 || integerSize - characterSize > 1) {
            return "";
        }
        if (characterSize <= integerSize) {
            int tem = 0;
            while (tem < s.length()) {
                if (tem % 2 == 0) {
                    builder.append(integers.get(integers.size() - 1));
                    integers.remove(integers.size() - 1);
                } else {
                    builder.append(characters.get(characters.size() - 1));
                    characters.remove(characters.size() - 1);
                }
                tem++;
            }
        } else {
            int tem = 0;
            while (tem < s.length()) {
                if (tem % 2 == 1) {
                    builder.append(integers.get(0));
                    integers.remove(0);
                } else {
                    builder.append(characters.get(0));
                    characters.remove(0);
                }
                tem++;
            }
        }
        return builder.toString();
    }

    public static String reformat1(String s) {
        char[] chars = new char[s.length()];
        int integers = 0;
        int characters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                integers++;
            } else {
                characters++;
            }
        }
        if (integers - characters > 1 || characters - integers > 1) {
            return "";
        }
        if (integers <= characters) {
            characters = 0;
            integers = 1;
        } else {
            characters = 1;
            integers = 0;
        }
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                chars[integers] = c;
                integers += 2;
            } else {
                chars[characters] = c;
                characters += 2;
            }
        }
        return new String(chars);
    }
}

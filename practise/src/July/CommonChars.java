package July;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    /**
     * 查找共用字符
     * 给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答案。
     * @param words
     * @return
     */
    public static List<String> commonChars(String[] words) {
        String res = words[0];
        for (int i = 0; i < words.length; i++) {
            String common = getCommon(res, words[i]);
            res = common;
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < res.length(); i++) {
            strings.add(String.valueOf(res.charAt(i)));
        }
        return strings;
    }

    public static String getCommon(String target,String str){
        String res = "";
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < characters.size(); j++) {
                if (target.charAt(i) == characters.get(j)){
                    res += target.charAt(i);
                    characters.remove(j);
                    break;
                }
            }

        }
        return res;
    }
}

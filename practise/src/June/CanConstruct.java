package June;

import java.util.ArrayList;
import java.util.List;

public class CanConstruct {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    /**
     * 赎金信
     *给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     * 如果可以，返回 true ；否则返回 false 。
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (ransomNote.charAt(i) == list.get(j)) {
                    list.remove(j);
                    break;
                }
            }
        }
        return magazine.length() - ransomNote.length() == list.size() ? true : false;
    }
}

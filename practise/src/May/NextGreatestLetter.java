package May;

import java.util.ArrayList;
import java.util.List;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    /**
     * 寻找比目标字母大的最小字母
     * 给你一个字符数组 letters，该数组按非递减顺序排序，以及一个字符 target。letters里至少有两个不同的字符。
     * 返回letters中大于 target 的最小的字符。如果不存在这样的字符，则返回letters 的第一个字符。
     * @param letters
     * @param target
     * @return
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        char result ;
        List<Character> list = new ArrayList<>();
        for (char letter : letters) {
            if (letter > target) {
                list.add(letter);
            }
        }
        if (list.size()!=0){
            result = list.get(0);
            for (Character character : list) {
                if (result > character) {
                    result = character;
                }
            }
        }else {
            return letters[0];
        }
        return result;
    }
}

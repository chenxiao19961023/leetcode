package June;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = "God Ding";
        System.out.println(reverseWords1(s));
    }

    public static String reverseWords(String s) {
        String res = "";
        String[] strings = s.split(" ");
        String tem = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length() - 1; j >= 0; j--) {
                tem += strings[i].charAt(j);
            }
            strings[i] = tem;
            tem = "";
        }
        for (String string : strings) {
            res += string + " ";
        }
        System.out.println(res.length());
        return res.substring(0,res.length()-1);
    }

    /**
     * 反转字符串中的单词 III
     * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * @param s
     * @return
     */
    public static String reverseWords1(String s) {
        String res = "";
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringBuilder.append(strings[i]).reverse().toString();
            stringBuilder.setLength(0);
        }
        for (String string : strings) {
            res += string + " ";
        }
        return res.substring(0,res.length()-1);
    }
}

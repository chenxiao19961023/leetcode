package Aug;

public class FreqAlphabets {
    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }

    /**
     * 解码字母到整数映射
     * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
     * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
     * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
     * 返回映射之后形成的新字符串。
     * 题目数据保证映射始终唯一。
     * @param s
     * @return
     */
    public static String freqAlphabets(String s) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length - 2; i++) {
            if (s.charAt(i + 2) == '#'){
                stringBuilder.append(get(Integer.valueOf(s.substring(i,i+2))));
                i = i + 2;
            } else {
                stringBuilder.append(get(Integer.valueOf(String.valueOf(s.charAt(i)))));
            }
        }
        if (s.charAt(length-1) != '#'){
            for (int i = s.lastIndexOf('#') + 1; i < s.length(); i++) {
                Integer integer = Integer.valueOf(String.valueOf(s.charAt(i)));
                char c = get(integer);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
    public static char get(Integer num){
        return (char) ('a' + num - 1);
    }
}

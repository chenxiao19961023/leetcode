package June;

public class CountSegments {
    public static void main(String[] args) {

    }

    /**
     * 字符串中的单词数
     * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
     * 请注意，你可以假定字符串里不包括任何不可打印的字符。
     * @param s
     * @return
     */
    public static int countSegments(String s) {
        int len = s.length();
        String str = "";
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                str = str + s.charAt(i);
            } else {
                if (str.length() != 0) {
                    count++;
                }
                str = "";
            }
        }
        if (str.length()!=0) count++;
        return count;
    }
}

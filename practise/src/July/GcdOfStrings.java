package July;

public class GcdOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

    /**
     * 字符串的最大公因子
     * 对于字符串 s 和 t，只有在 s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。
     * 给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。
     * @param str1
     * @param str2
     * @return
     */
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0,getBig(str1.length(),str2.length()));
    }
    public static int getBig(int len1, int len2){
        int tem = 0;
        while (len2 != 0){
            tem = len2;
            len2 = len1 % len2;
            len1 = tem;
        }
        return len1;
    }
}

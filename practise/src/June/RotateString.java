package June;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal  = "abcde";
        System.out.println(rotateString(s, goal));
    }

    /**
     * 旋转字符串
     * 给定两个字符串, s和goal。如果在若干次旋转操作之后，s能变成goal，那么返回true。
     * s的 旋转操作 就是将s 最左边的字符移动到最右边。
     * 例如, 若s = 'abcde'，在旋转一次之后结果就是'bcdea'。
     * @param s
     * @param goal
     * @return
     */
    public static boolean rotateString(String s, String goal) {
        char[] chars = s.toCharArray();
        char tem;
        for (int i = 0; i < chars.length; i++) {
            tem = chars[0];
            for (int j = 1; j < chars.length; j++) {
                chars[j-1] = chars[j];
            }
            chars[chars.length-1] = tem;
            if (new String(chars).equals(goal)){
                return true;
            }
        }
        return false;
    }
}

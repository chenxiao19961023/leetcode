package July;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates2(s));
    }

    /**
     * 删除字符串中的所有相邻重复项
     * 给出由小写字母组成的字符串S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
     * 在 S 上反复执行重复项删除操作，直到无法继续删除。
     * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
     * @param s
     * @return
     */
    public static String removeDuplicates2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length() - 1) == chars[i]) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}

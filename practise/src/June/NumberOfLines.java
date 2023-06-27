package June;

import java.util.Arrays;

public class NumberOfLines {
    public static void main(String[] args) {
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }

    /**
     *写字符串需要的行数
     * 我们要把给定的字符串 S从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，
     * 那么我们应该把这个字母写到下一行。我们给定了一个数组widths，这个数组widths[0] 代表 'a' 需要的单位，widths[1] 代表 'b' 需要的单位，...，widths[25] 代表 'z' 需要的单位。
     * 现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。
     * @param widths
     * @param s
     * @return
     */
    public static int[] numberOfLines(int[] widths, String s) {
        int sum = widths[s.charAt(0) - 97];
        int count = 1;
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            index = s.charAt(i) - 97;
            if ((sum <= 100 && (sum + widths[index]) > 100)) {
                count++;
                sum = 0;
            }
            sum += widths[index];
        }
        return new int[]{count,sum};
    }
}

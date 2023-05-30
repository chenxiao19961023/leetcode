package may;

public class TitleToNumber {
    public static void main(String[] args) {
        String s = "A";
        String s1 = "AB";
        String s2 = "ZY";
        System.out.println(titleToNumber(s2));
    }

    /**
     * Excel 表列序号
     * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
     * @param columnTitle
     * @return
     */
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        int count = 0;
        char[] chars = columnTitle.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sum = sum + (chars[i]-'@')*(int) Math.pow(26,count++);
        }
        return sum;
    }
}

package may;

public class ConvertToTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(27));
    }

    /**
     * Excel表列名称
     * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
     * @param columnNumber
     * @return
     */
    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber -= 1;
            stringBuilder.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}

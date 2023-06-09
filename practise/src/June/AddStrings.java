package June;
public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }

    /**
     * 字符串相加
     * 给定两个字符串形式的非负整数num1 和num2，计算它们的和并同样以字符串形式返回。
     * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger），也不能直接将输入的字符串转换为整数形式。
     * @param num1
     * @param num2
     * @return
     */
    public static  String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int carry = 0;
        int n1 = 0;
        int n2 = 0;
        StringBuilder builder = new StringBuilder();
        while (len2 >= 0 || len1 >= 0) {
            if (len1 >= 0) {
                n1 = num1.charAt(len1--) - '0';
            } else n1 = 0;
            if (len2 >= 0) {
                n2 = num2.charAt(len2--) - '0';
            } else n2 = 0;
            builder.append((n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }
        if (carry==1){
            builder.append(1);
        }
        return builder.reverse().toString();
    }

}

package June;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        System.out.println(licenseKeyFormatting(s, 2));
    }

    /**
     * 密钥格式化
     * 给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。你也会得到一个整数 k 。
     * 我们想要重新格式化字符串s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外，两组之间必须插入破折号，并且应该将所有小写字母转换为大写字母。
     * 返回 重新格式化的许可密钥 。
     * @param s
     * @param k
     * @return
     */
    public static String licenseKeyFormatting(String s, int k) {
        String str = "";
        StringBuffer stringBuffer = new StringBuffer();
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                if (s.charAt(i) >= 'a' & s.charAt(i) <= 'z') {
                    str = str + (char) (s.charAt(i) - 32);
                } else {
                    str = str + s.charAt(i);
                }
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuffer.append(str.charAt(i));
            t++;
            if (t % k == 0 && i != 0) {
                stringBuffer.append("-");
            }
        }
        return stringBuffer.reverse().toString();
    }
}

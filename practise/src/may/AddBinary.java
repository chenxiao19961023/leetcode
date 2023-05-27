package may;

public class AddBinary {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String c = "11";
        String d = "1";
        String e = "1010";
        String f = "1011";
        System.out.println(addBinary(a, b));
    }

    /**
     * 二进制求和
     * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        int carryBit = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int count = 0;
        int aNum = 0;
        int bNum = 0;
        StringBuilder builder = new StringBuilder();
        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                aNum = a.charAt(aLen--) - '0';
            } else {
                aNum = 0;
            }
            if (bLen >= 0) {
                bNum = b.charAt(bLen--) - '0';
            } else {
                bNum = 0;
            }
            count = aNum + bNum + carryBit;
            if (count / 2 == 1) {
                carryBit = 1;
            } else {
                carryBit = 0;
            }
            builder.append(count % 2);
        }
        if (carryBit == 1) builder.append(1);
        return builder.reverse().toString();
    }
}

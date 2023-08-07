package May;

public class IsOneBitCharacter {
    public static void main(String[] args) {
        int[] bits = {1, 0, 0, 0, 0, 0};
        int[] bits1 = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }

    /**
     * 1 比特与 2 比特字符
     * 有两种特殊字符：
     * 第一种字符可以用一比特0 表示
     * 第二种字符可以用两比特（10或11）表示
     * 给你一个以 0 结尾的二进制数组bits，如果最后一个字符必须是一个一比特字符，则返回 true 。
     * @param bits
     * @return
     */
    public static boolean isOneBitCharacter(int[] bits) {
        int i;
        for (i = 0; i < bits.length - 1; i++) {
            if (bits[i] == 1) {
                i++;
            }
        }
        return i == bits.length - 1;
    }
}

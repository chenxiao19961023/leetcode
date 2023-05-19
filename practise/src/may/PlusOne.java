package may;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] digits1 = {9, 9, 9, 9};

        //错误的方法
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne1(digits1)));
    }

    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int sum = 0;
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            sum = sum * 10 + digits[i];
        }
        sum += 1;
        String[] split = String.valueOf(sum).split("");
        int[] count = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            count[i] = Integer.valueOf(split[i]);
        }
        return count;
    }


    public static int[] plusOne1(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] % 10 != 0) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digits1 = new int[digits.length + 1];
        digits1[0] = 1;
        return digits1;
    }
}

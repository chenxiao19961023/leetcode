package may;

import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        int[] nums1 = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums1));
    }

    /**
     * 数组拆分
     * 给定长度为2n的整数数组 nums ，你的任务是将这些数分成n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到n 的 min(ai, bi) 总和最大。
     *
     * @param nums
     * @return
     */
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i++];
        }
        return count;
    }
}

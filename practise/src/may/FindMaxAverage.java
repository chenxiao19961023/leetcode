package may;

public class FindMaxAverage {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage1(nums, k));
    }

    /**
     * 子数组最大平均数 I
     * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
     * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
     * 任何误差小于 10-5 的答案都将被视为正确答案。
     *
     * @param nums
     * @param k
     * @return
     */
    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int count = 0;
            for (int j = i; j < i + k; j++) {
                count += nums[j];
            }
            if (count > max) {
                max = count;
            }
        }
        double ave = (double) max / k;
        return ave;
    }

    public static double findMaxAverage1(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        int tem = max;
        for (int i = k; i < nums.length; i++) {
            tem = tem + nums[i] - nums[i - k];
            if (tem > max) {
                max = tem;
            }
        }
        return (double) max / k;
    }
}

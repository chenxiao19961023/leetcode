package May;

public class DominantIndex {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1,0};
        int[] nums3 = {0, 0, 0, 1};
        System.out.println(dominantIndex(nums2));
    }

    /**
     * 至少是其他数字两倍的最大数
     * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
     * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1
     * @param nums
     * @return
     */
    public static int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                sec = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > sec) {
                sec = nums[i];
            }
        }
        System.out.println(max+" "+sec);
        return max>=sec*2?index:-1;
    }
}

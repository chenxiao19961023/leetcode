import java.util.ArrayList;

public class FindLengthOfLCIS {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int[] nums1 = {2, 2, 2, 2, 2, 2};
        System.out.println(findLengthOfLCIS1(nums));
    }

    /**
     * 最长连续递增序列
     * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
     * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
     * @param nums
     * @return
     */
    public static int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int tem = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                tem++;
            } else {
                if (count < tem) {
                    count = tem;
                }
                tem = 1;
            }
        }
        return count;
    }

    public static int findLengthOfLCIS1(int[] nums) {
        int count = 1;
        int tem = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                tem++;
                if (count < tem) {
                    count = tem;
                }
            } else {
                tem = 1;
            }
        }
        return count;
    }
}

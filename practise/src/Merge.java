import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    /**
     * 给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int j = m; j < m + n; j++) {
            nums1[j] = nums2[count++];
        }
        int len = nums1.length;
        //Arrays.sort(nums1);
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int t = 0;
                if (nums1[i] > nums1[j]) {
                    t = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}

package may;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums1 = {0, 1};
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums3 = {0};
        System.out.println(missingNumber1(nums));
    }

    /**
     * 丢失的数字
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int flag = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
            flag = 0;
        }
        return 0;
    }

    public static int missingNumber1(int[] nums) {
        int len = nums.length;
        int n = 0;
        for (int i = 0; i < len; i++) {
            n = n ^ i ^ nums[i];
        }
        return n ^ len;
    }
}

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1};
        System.out.println(findMaxConsecutiveOnes1(nums));
    }

    /**
     * 最大连续 1 的个数
     * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
     *
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max)
                    max = count;
            } else {
                count = 0;
            }

        }
        return max;
    }

    public static int findMaxConsecutiveOnes1(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            count = ++count * num;
            if (count > max) max = count;
        }
        return max;
    }
}

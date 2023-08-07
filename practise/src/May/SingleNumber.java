package May;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums1 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));
    }

    /**
     * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
}

package May;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        if (target < nums[0])
            return 0;
        for (int t = 1; t < nums.length; t++) {
            if (nums[t - 1] <= target && nums[t] >= target) {
                return t;
            }
        }
        return nums.length;
    }
}

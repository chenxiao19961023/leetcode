package May;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        System.out.println(pivotIndex(nums));
    }

    /**
     * 寻找数组的中心下标
     * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
     * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
     * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
        }
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}

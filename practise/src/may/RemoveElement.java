package may;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 6, 7, 8};
        int val = 3;
        //System.out.println(removeElement(nums, val));
        System.out.println(removeElement1(nums, val));
    }


    /**
     * 移除元素（暴力解法）
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    /**
     * 移除元素（双指针）
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement1(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
            right++;
        }
        return left;
    }
}

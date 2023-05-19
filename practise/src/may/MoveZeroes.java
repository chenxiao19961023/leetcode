package may;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums1 = {0, 0, 1};
        moveZeroes(nums1);
    }

    /**
     * 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int temp = 0;
        if (len == 1) {
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] == 0) {
                    temp = nums[i];
                    for (int j = i ; j < len-1; j++) {
                        nums[j] = nums[j+1];
                    }
                    nums[len-1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void moveZeroes1(int[] nums) {
        int slow = 0;
        int len = nums.length;
        for (int fast = 0; fast < len; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }
        while (slow<len){
            nums[slow++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

}

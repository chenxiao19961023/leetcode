package May;

import java.util.*;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums1 = {1, 1};
        List<Integer> list = findDisappearedNumbers1(nums);
        System.out.println(list);
    }

    /**
     * 找到所有数组中消失的数字
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] ints = new int[nums.length + 1];
        for (int num : nums) {
            ints[num] = 1;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (ints[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}

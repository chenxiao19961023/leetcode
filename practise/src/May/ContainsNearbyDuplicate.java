package May;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 5;
        //System.out.println(containsNearbyDuplicate(nums, k));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(555);
        set.add(4);
        set.add(5);
        set.remove(2);
        System.out.println(set);
    }

    /**
     * 存在重复元素II
     * 给你一个整数数组nums 和一个整数k ，判断数组中是否存在两个 不同的索引i和j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < len - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j <= i + k; j++) {
                if (!set.add(nums[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (set.add(nums[i])) {
                if (set.size() == k + 1) {
                    set.remove(nums[i - k]);
                }
            } else return true;
        }
        return false;
    }


    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

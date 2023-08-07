package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] ints = intersect(nums1, nums2);
        String s = Arrays.toString(ints);
        System.out.println(s);
    }


    /**
     * 两个数组的交集 II
     * 给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                list1.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] ints = new int[list1.size()];
        int t = 0;
        for (Integer integer : list1) {
            ints[t++] = integer;
        }
        return ints;
    }
}

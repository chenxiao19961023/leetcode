import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ints = intersection1(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 两个数组的交集
     * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    set.add(nums2[j]);
                }
            }
        }
        int[] ints = new int[set.size()];
        int n = 0;
        for (Integer integer : set) {
            ints[n++] = integer;
        }
        return ints;
    }
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                set1.add(nums2[i]);
        }
        int[] ints = new int[set1.size()];
        int n = 0;
        for (Integer integer : set1) {
            ints[n++] = integer;
        }
        return ints;
    }
}

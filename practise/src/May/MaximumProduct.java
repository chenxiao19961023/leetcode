package May;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums1 = {-1,-2,-3,4};
        System.out.println(maximumProduct(nums1));
    }

    /**
     *  三个数的最大乘积
     *  给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = nums[len-1]*nums[len-2]*nums[len-3];
        int b = nums[0]*nums[1]*nums[len-1];
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}

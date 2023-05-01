import java.util.HashMap;
import java.util.Map;

public record MajorityElement() {
    public static void main(String[] args) {
       int[] nums = {3,2,3};
       int[] nums1 = {2,2,1,1,1,2,2};
        int element = majorityElement(nums1);
        System.out.println(element);
    }

    /**
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int count = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>count){
                count = entry.getValue();
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == count)
                max = integer;
        }
        if (count>nums.length/2){
            return max;
        }else {
            return 0;
        }

    }
}

package may;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int[] candyType1 = {1, 1, 2, 3};

        System.out.println(distributeCandies2(candyType1));
    }

    /**
     * 分糖果
     * Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
     * 医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
     * 给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的 最多 种类数。
     * @param candyType
     * @return
     */
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        int size = set.size();
        int len = candyType.length / 2;
        return len <= size ? len : size;
    }

    public static int distributeCandies1(int[] candyType) {
        long count = Arrays.stream(candyType).distinct().count();
        int len = candyType.length / 2;
        return len <= count ? len : (int) count;
    }

    public static int distributeCandies2(int[] candyType) {
        int slow = 1;
        int fast = 1;
        Arrays.sort(candyType);
        for (; fast < candyType.length; fast++) {
            if (candyType[fast] != candyType[fast - 1]) {
                slow++;
            }
        }
        return slow <= candyType.length/2 ? slow : candyType.length/2;
    }
}

package June;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        System.out.println(largeGroupPositions(s));
    }

    /**
     * 较大分组的位置
     * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
     * 例如，在字符串 s = "abbxxxxzyy"中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
     * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
     * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
     * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
     * @param s
     * @return
     */
    public static List<List<Integer>> largeGroupPositions(String s) {
        Integer fast = 1;
        Integer slow = 0;
        List<List<Integer>> list = new ArrayList<>();
        while (fast < s.length()) {
            if (s.charAt(slow) != s.charAt(fast)) {
                if ((fast - slow) >= 3) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(slow);
                    integers.add(fast - 1);
                    list.add(integers);
                }
                slow = fast;
            }
            fast++;
        }
        if ((fast - slow) >= 3) {
            List<Integer> integers = new ArrayList<>();
            integers.add(slow);
            integers.add(fast - 1);
            list.add(integers);
        }
        return list;
    }
}

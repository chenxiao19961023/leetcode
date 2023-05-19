package may;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        System.out.println(generate(22));

    }

    /**
     * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
     * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(lists.get(i - 2).get(j - 1) + lists.get(i - 2).get(j));
                }
            }
            lists.add(list);
        }
        return lists;
    }
}

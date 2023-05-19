package may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetRow {
    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        System.out.println(list);
    }

    /**
     * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
     * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list1.add(1);
                } else {
                    list1.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
            list.add(list1);
        }
        return list.get(rowIndex);
    }
}

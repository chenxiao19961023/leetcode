package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRestaurant {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        String[] strings = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(strings));
    }

    /**
     *两个列表的最小索引总和
     * 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
     * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。
     * @param list1
     * @param list2
     * @return
     */
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int count = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (count == i + j) {
                        list.add(list1[i]);
                    } else if (count > i + j) {
                        count = i + j;
                        list.clear();
                        list.add(list1[i]);
                    }
                }
            }
        }
        String[] s = new String[list.size()];
        int k = 0;
        for (String s1 : list) {
            s[k++] = s1;
        }
        return s;
    }
}

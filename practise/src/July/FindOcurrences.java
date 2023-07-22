package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOcurrences {
    public static void main(String[] args) {
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        String[] ocurrences = findOcurrences(text, first, second);
        System.out.println(Arrays.toString(ocurrences));

    }

    /**
     * Bigram 分词
     * 给出第一个词first 和第二个词second，考虑在某些文本text中可能以 "first second third" 形式出现的情况，其中second紧随first出现，third紧随second出现。
     * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
     * @param text
     * @param first
     * @param second
     * @return
     */
    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length - 2; i++) {
            if (strings[i].equals(first) && strings[i + 1].equals(second)){
                list.add(strings[i + 2]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}

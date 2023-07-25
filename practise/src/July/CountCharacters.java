package July;

public class CountCharacters {
    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        System.out.println(countCharacters(words, chars));
    }

    /**
     * 拼写单词
     * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
     * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
     * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
     * 返回词汇表 words 中你掌握的所有单词的 长度之和。
     * @param words
     * @param chars
     * @return
     */
    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        int index = 0;
        for (String word : words) {
            int[] ints = new int[26];
            for (int i = 0; i < chars.length(); i++) {
                ints[chars.charAt(i) - 97]++;
            }
            for (int i = 0; i < word.length(); i++) {
                ints[word.charAt(i) - 97]--;
                if (ints[word.charAt(i) - 97]<0){
                    break;
                }
                index++;
            }
            if (index==word.length()){
                res += word.length();
            }
            index = 0;
        }
        return res;
    }
}

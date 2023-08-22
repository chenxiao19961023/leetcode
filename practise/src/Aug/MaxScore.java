package Aug;

public class MaxScore {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(maxScore(s));
    }

    /**
     * 分割字符串的最大得分
     * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
     * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
     * @param s
     * @return
     */
    public static int maxScore(String s) {
        int leftCount = 0;
        int rightCount = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') rightCount++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftCount++;
            }else rightCount--;
            if (leftCount+rightCount>result){
                result = leftCount+rightCount;
            }
        }
        return result;
    }
}

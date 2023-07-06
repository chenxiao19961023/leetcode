package July;

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s, t));
    }

    /**
     * 比较含退格的字符串
     * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
     * 注意：如果对空文本输入退格字符，文本继续为空。
     * @param s
     * @param t
     * @return
     */
    public static boolean backspaceCompare(String s, String t) {
        String res1 = res1(s);
        String res = res1(t);
        return res.equals(res1) ? true : false;
    }

    //使用栈类
    public static String res(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(str.charAt(i));
            }
        }
        return stack.toString();
    }

    //手动模拟找
    public static String res1(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                res.append(str.charAt(i));
            } else {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }
}

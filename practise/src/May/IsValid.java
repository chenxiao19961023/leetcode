package May;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String s = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "{[]}";
        String s4 = "((";
        System.out.println(isValid(s4));
    }

    /**
     * 有效的括号
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 每个右括号都有一个对应的相同类型的左括号。
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) return false;
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i]=='('){
                characters.add(')');
            }else if (chars[i]=='{'){
                characters.add('}');
            }else if (chars[i]=='['){
                characters.add(']');
            }else if (characters.isEmpty()||chars[i]!=characters.pop()){
                return false;
            }
        }
        return characters.isEmpty();
    }
}

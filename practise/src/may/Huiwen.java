package may;

public class Huiwen {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome1(x));
    }

    /**
     * 判断回文
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x / 10 == 0 && x != 0)) return false;
        int n = String.valueOf(x).length() / 2;
        int a = 0;
        int b = x;
        for (int i = 0; i < n; i++) {
            a = 10 * a + b % 10;
            b = b / 10;
        }
        if (String.valueOf(x).length() % 2 != 0) {
            b = b / 10;
        }
        if (a == b) return true;
        return false;
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int a = 0;
        while (x > a) {
            a = a * 10 + x % 10;
            x = x / 10;
        }
        return a == x || x == a / 10;
    }
}
package June;

public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    /**
     * 宝石与石头
     * 给你一个字符串 jewels代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。stones中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * 字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。
     * @param jewels
     * @param stones
     * @return
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int k = 0; k < stones.length(); k++) {
                if (jewels.charAt(i) == stones.charAt(k)) {
                    count++;
                }
            }
        }
        return count;
    }
}

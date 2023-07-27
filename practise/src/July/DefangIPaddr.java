package July;

public class DefangIPaddr {
    public static void main(String[] args) {
        String address = "";
        System.out.println(defangIPaddr(address));
    }

    /**
     * IP 地址无效化
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)!='.'){
                stringBuilder.append(address.charAt(i));
            }else {
                stringBuilder.append("[.]");
            }
        }
        return stringBuilder.toString();
    }
}

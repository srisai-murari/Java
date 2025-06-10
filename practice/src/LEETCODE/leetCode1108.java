package LEETCODE;

public class leetCode1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.')
                out.append(address.charAt(i));
            else
                out.append("[.]");
        }
        System.out.println(out);
//single line
            String ot = address.replace(".", "[.]");
            System.out.println(ot);
     }
}

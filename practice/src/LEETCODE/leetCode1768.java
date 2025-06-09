package LEETCODE;

public class leetCode1768 {
    public static void main(String[] args) {
        String s1 = "abcdfalk";
        String s2 = "pqr";
        System.out.println(mergeAlternatively(s1, s2));
        System.out.println(mergeAlternativelySB(s1,s2));

    }

    private static String mergeAlternativelySB(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int sp =0;
        while(i < s1.length() && j < s2.length()){
            if(sp % 2 == 0){
                sb.append(s1.charAt(i));
                i++;
            }
            else{
                sb.append(s2.charAt(j));
                j++;
            }
            sp++;
        }
        while(i < s1.length()){
            sb.append(s1.charAt(i));
            i++;
        }
        while(j < s2.length())
        {
            sb.append(s2.charAt(j));
            j++;
        }
        System.out.println(sb);


        return sb.toString();
    }

    private static String mergeAlternatively(String s1, String s2) {
        char [] ans = new char[s1.length() + s2.length()];
        int sp = 0,i = 0, j = 0;
        while(i < s1.length() && j < s2.length()){
            if(sp % 2 == 0){
                ans[sp] = s1.charAt(i);
                i++;
            }
            else {
                ans[sp] = s2.charAt(j);
                j++;
            }
            sp++;
        }
        while(i < s1.length()){
            ans[sp] = s1.charAt(i);
            i++;
            sp++;
        }
        while(j < s2.length()){
            ans[sp] = s2.charAt(j);
            j++;
            sp++;

        }
        return new String(ans);
    }
}

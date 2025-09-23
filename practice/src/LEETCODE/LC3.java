package LEETCODE;

public class LC3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int winE = 0, winS = 0;
        int len = 0, maxLen = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(winE = 0; winE < n; winE++){
            char ch = s.charAt(winE);
            int index = sb.indexOf(ch + "");
            if(index == -1){
                sb.append(ch);
            }
            else {
                sb.delete(0, index + 1);
                sb.append(ch);
            }

            len = sb.length();
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}

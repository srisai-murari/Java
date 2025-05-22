package LEETCODE;

public class leetCode_1832 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean val = pangram("leetcode");
        System.out.println(val);
    }
    static boolean pangram(String str){
        int n = str.length();
        int[] alphabets = new int[26];
        if(n<26){
            return false;
        }
        for (int i = 0; i < n; i++) {
            alphabets[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(alphabets[i] < 1) return false;
        }
        return true;
    }
    static boolean pangram_builtin(String str){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if(!str.contains(String.valueOf(ch))) return false;
        }
        return true;
    }
}

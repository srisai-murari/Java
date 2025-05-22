package LEETCODE;

public class leetCode344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int i =0, n= s.length;
        while(i<n/2){

            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
            i++;
        }
        for(char c : s){
            System.out.println(c);
        }


    }
}

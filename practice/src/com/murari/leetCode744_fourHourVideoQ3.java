package com.murari;

public class leetCode744_fourHourVideoQ3 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char ans = ngl(letters, 'z');
    }
    static char ngl(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end-start)/2;
            if(target < letters[mid])
                end = mid -1;
            else if(target > letters[mid])
                start = mid +1;
        }
        return letters[start % letters.length];
    }
}

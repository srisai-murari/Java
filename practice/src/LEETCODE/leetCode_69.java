package LEETCODE;

public class leetCode_69 {
    public static void main(String[] args) {
        System.out.println(sqrt(3));
    }
    static int sqrt(int n){
        if(n<0) return 0;
        else if(n==1 || n==2) return n;
        long start = 1;
        long end = n;
        long mid =0;
        long result = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid * mid == n) return (int) mid;
            else if(mid*mid < n) {
                start = mid+1;
                result = mid;
            }

            else end = mid-1;
        }
        return (int) result;
    }

}

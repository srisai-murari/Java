package LEETCODE;

public class leetCode441 {
    public static void main(String[] args) {
        int n = 10;
//        int x = arrangeCoins(n);
//        System.out.println(x);
//        System.out.println(arrarngeCoins1(n));
        System.out.println(arrangeCoins2(n));
        System.out.println(arrangeCoinsBinary(n));

    }

    private static int arrangeCoins(int n) {
        int x = 0, prevX = 0, i = 1;
        for (i = 100; i <= n ; i++) {
            x = i * (i + 1) / 2;
            if(x <= n){
                continue;
            }

            else return i - 1;

        }
        return i+1;
        }
        static int arrarngeCoins1(int n){
        int i = 0, x = 0;
        for(i = 1; i <= n; i++)
        {
            x = i * (i + 1) / 2;
            if(x > n)
                break;
            else if(x == n)
                return i;
        }
        return i - 1;

    }
    private static int arrangeCoinsBinary(int n){
        long low = 0, high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long current = mid * (mid + 1) / 2;

            if (current == n) {
                return (int) mid;
            } else if (current < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }
    private static int  arrangeCoins2(int n) {
//        int k = (int)(-1 + Math.sqrt(1 + 8 * n)) / 2;
        int k = (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
        return k;

    }

}

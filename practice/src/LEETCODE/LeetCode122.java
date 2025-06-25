package LEETCODE;

public class LeetCode122 {
    public static void main(String[] args) {
        int [] prices = {1,5,3,100};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int [] prices){
        int profit =0, buy = prices[0], sell = 0;

        for (int i = 1; i < prices.length; i++) {
            if(buy > prices[i])
                buy = prices[i];
            else {
                profit = profit + prices[i] - buy;
                buy = prices[i];

            }
        }




        return profit;
    }
}

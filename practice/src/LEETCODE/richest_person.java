package LEETCODE;

public class richest_person {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        int max = MaximumWealth(arr);
        System.out.println(max);
    }
    static int MaximumWealth(int[][] accounts){
        int max_wealth =0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
                
            }
            if(wealth >= max_wealth)
                max_wealth = wealth;
        }

    return max_wealth;
    }
}

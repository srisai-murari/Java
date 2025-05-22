package LEETCODE;
import java.util.*;
public class leetCode1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        KidsWithCandies(candies,3);
        List<Boolean> ans = KWC(candies, 3);
        System.out.println(ans);

    }
    static List<Boolean> KidsWithCandies(int[] candies, int extracandies){
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extracandies;
            int flag =0;
            for (int j = 0; j < candies.length; j++) {
                if(sum >= candies[j]){
                    flag++;
                }
            }
            if(flag == candies.length)
                ans.add(true);

        }



   return ans; }

    //new

    static List<Boolean> KWC(int[] candies, int extracandies){
        List<Boolean> ans = new ArrayList<>();
        int max= 0;
        for(int i : candies)
            if(i > max)
                max = i;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extracandies >= max)
                ans.add(true);
            else ans.add(false);

        }
            return ans;
        }

}

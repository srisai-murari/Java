package Concepts;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-4, -1, -1, 0 , 1, 2};
        System.out.println(threeSum(arr));
    }
    
    public static List<List<Integer>> threeSum (int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

                if(i > 0 && arr[i - 1] == arr[i]) continue;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(arr[i]);
                    inner.add(arr[j]);
                    inner.add(arr[k]);

                    outer.add(inner);
                    j++;
                    while(j < k && arr[j] == arr[j - 1]) j++;
                }
                else if(sum > 0) k--;
                else j++;
            }
        }
        return outer;
     }
}

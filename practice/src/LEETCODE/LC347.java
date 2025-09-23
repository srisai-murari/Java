package LEETCODE;

import java.util.*;

public class LC347 {
    public static void main(String[] args) {
        int [] ans = topKfrequent(new int [] {1,1,1,2,2,3,4,43,4,4,4,4,4,4}, 2);
        System.out.println(Arrays.toString(ans));
    }
/*brute
    private static int [] topKfrequent (int [] arr, int k){
        int [] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int ptr = 0;
        int maxval = Integer.MIN_VALUE;
        int maxkey = -1;

        //finding max value
        for (int i = 0; i < k; i++) {
            int maxKey = findMaxKey(map);
            ans[i] = maxKey;
        }

        System.out.println(map);
        return ans;
    }

    private static int findMaxKey(HashMap <Integer, Integer> map){
        int maxval = 0;
        int maxkey = Integer.MIN_VALUE;

        for(HashMap.Entry<Integer, Integer> i : map.entrySet()){
            int val = i.getValue();
            if(val > maxval){
                maxval = val;
                maxkey = i.getKey();
            }
        }

        map.put(maxkey, -1);
        return maxkey;

    }

*/
    private static int [] topKfrequent (int [] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] list = new ArrayList[arr.length + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            int value = i.getValue();
            list[value].add(i.getKey());
        }

        int [] ans = new int[k];
        int ptr = 0;
        for(int i = list.length - 1; i >= 0; i--){
            for(int j = 0; j < list[i].size(); j++){
               ans[ptr++] = list[i].get(j);
               if(ptr == k)
                    return ans;
            }
        }
        return ans;
    }
}

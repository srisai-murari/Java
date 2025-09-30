package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC386 {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(13));
        System.out.println(lexicalOrder2(13));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            list.add(i + "");
        }

        Collections.sort(list);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            res.add(Integer.parseInt(list.get(i)));

        return res;
    }

    private static List<Integer> lexicalOrder2 (int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if(i > n) break;
            helper(i, n, res);
        }

        return res;
    }
    
    private static void helper(int curNum, int target, List<Integer> res){
        if(curNum > target) return;
        
        res.add(curNum);
        for (int i = 0; i < 10; i++) {
            int nextNum = curNum * 10 + i;
            if(nextNum > target) break;
            helper(nextNum, target, res);
        }
    }
}

package Aon.test;

import java.util.*;

public class Amazon {

    public static int minimizeCleaningCost(String dataset, int matchCost, int mismatchCost) {
        int n = dataset.length();
        if (n == 0) return 0;            // empty
        if ((n & 1) == 1) {
            // according to prompt n should be even; if not, we can't fully pair.
            // We'll assume input always even; otherwise, handle as error or return -1.
        }

        int[] freq = new int[26];
        for (char c : dataset.toCharArray()) freq[c - 'a']++;

        int fmax = 0;
        int sumFloor = 0; // maximum possible same-letter pairs
        for (int f : freq) {
            if (f > fmax) fmax = f;
            sumFloor += f / 2;
        }

        int totalPairs = n / 2;
        // minimum same-letter pairs forced by dominance of a single char
        int minSame = Math.max(0, fmax - totalPairs);

        int samePairs;
        if (matchCost < mismatchCost) {
            // prefer as many same-letter pairs as possible
            samePairs = sumFloor;
        } else if (matchCost > mismatchCost) {
            // prefer as few same-letter pairs as possible (but at least minSame)
            samePairs = minSame;
        } else {
            // equal cost: any feasible number of samePairs works; pick minSame
            samePairs = minSame;
        }

        // ensure samePairs is within feasible bounds
        if (samePairs < minSame) samePairs = minSame;
        if (samePairs > sumFloor) samePairs = sumFloor;

        int cost = samePairs * matchCost + (totalPairs - samePairs) * mismatchCost;
        return cost;
    }

    public static int minimizeCleaningCost2(String s, int matchCost, int mismatchCost){
        char [] ch = s.toCharArray();
        Arrays.sort(ch);

        int n = s.length();
        int totalCost = 0;
        int i = 0;
        int samePairCount = 0;


        while(i < n - 1){
            if(ch[i] == ch[i + 1]){
                ch[i] = '0';
                ch[i + 1] = '0';
                i++;
                samePairCount++;
            }
            i++;
        }

        int leftPairs = (n - (samePairCount * 2)) / 2;
        System.out.println(samePairCount + " " + leftPairs);
        //so far we've found no of pairs and non pairs

        if(matchCost < mismatchCost){
            totalCost += matchCost * samePairCount + mismatchCost * leftPairs;
        }
        else
            totalCost += mismatchCost * (leftPairs + samePairCount);



        return totalCost;
    }

    public static int findSumOfUniqueGaps(int [] arr){
        List<List<Integer>> sub = subArrays(arr);

        int res = 0;
        for(List<Integer> l : sub){
            Collections.sort(l);
            int small = l.get(0);
            int large = l.get(l.size() - 1);

            res += large - small;
        }



        return 0;

    }

    private static List<List<Integer>> subArrays(int [] arr){
        List<List<Integer>> subArrays = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                List<Integer> sub = new ArrayList<>();
                if(j - i != 0){
                    for(int k = i;k <= j; k++){
                        sub.add(arr[k]);
                    }
                }
                if(!sub.isEmpty())
                    subArrays.add(sub);
            }

        }
        return subArrays;
    }



    public static void main(String[] args) {
        String s = "oiuodaeqrytd";
        System.out.println(minimizeCleaningCost(s, 12, 12));
        System.out.println(minimizeCleaningCost2(s, 12, 12));

        System.out.println(subArrays(new int []{2,1,4,3}));
    }
}
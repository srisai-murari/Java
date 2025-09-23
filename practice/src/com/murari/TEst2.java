package com.murari;

import java.util.ArrayList;
import java.util.List;

class TEst2 {
    public static void main(String[] args) {
        int [] nums = {-1,1,2};
        System.out.println(subset(nums));
    }

    public static List<List<Integer>> subset (int [] nums){

        List<List<Integer>> outer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i : nums){
            sb.append(i);
        }
        subset("", sb.toString(), outer);

        return outer;
    }

    private static void subset (String p, String up, List<List<Integer>> outer){

        if(up.isEmpty()){
            List<Integer> inner = new ArrayList<>();

            for(int i = 0; i < p.length(); i++){
                int n = p.charAt(i) - '0';
                inner.add(n);
            }
            outer.add(inner);

            return;
        }

        subset(p + up.charAt(0), up.substring(1), outer);
        subset(p, up.substring(1), outer);

    }
}
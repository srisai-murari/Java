package LEETCODE;

import java.util.Arrays;

public class leetCode888 {
    public static void main(String[] args) {
        int [] alice = {20,35,22,6,13};
        int [] bob = {31, 57};
        int [] aliceTest2 = {1,17,14,1,16};
        int [] bobTest2 = {26,11};
        int [] ans = fairCandySwap(aliceTest2,bobTest2);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] fairCandySwap(int[] alice, int[] bob){
        int [] answer = new int[2];
        int aSum = sum(alice);
        int bSum = sum(bob);
        int diff = Math.abs(aSum - bSum);
        Arrays.sort(alice);
        Arrays.sort(bob);
//        System.out.println(diff);
        if(aSum < bSum)
            for (int i = 0; i < alice.length; i++) {
                int ind = bs(bob, alice[i] + diff/2);
                if(ind != -1) {
//                    answer[0] = alice[i];
//                    answer[1] = bob[ind];
                    return new int [] {alice[i] , bob[ind]};
                }
            }
        else
            for (int i = 0; i < bob.length; i++) {
                int ind = bs(alice, bob[i] + diff/2);
                if(ind != -1) {
//                    answer[0] = alice[ind];
//                    answer[1] = bob[i];
                    return new int [] {alice[ind] , bob[i]};
                }
            }

    return answer;}

    public static int bs(int[] arr, int target){
        int s = 0, e = arr.length-1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == target)
            return mid;
        else if(arr[mid] < target)
            s = mid +1;
        else e = mid -1;
    }
    return -1;}

    private static int sum(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}


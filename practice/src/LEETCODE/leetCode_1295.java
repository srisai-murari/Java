package LEETCODE;

public class leetCode_1295 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 3, 53, 2348};
//        int ans = findNumbers(arr);
//        System.out.println(ans);
//        System.out.println(arr[0]);
     int ans =   opti_even(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int values =0;
//        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count =0;
            while(temp>0){
                temp = temp/10;
                count++;

            }
            if(count%2 == 0){
                values++;
            }
        }
        return values;

    }
    static int opti_even(int[] nums){
        int values = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            count = (int)(Math.log10(nums[i])) + 1; //Gets the count of nums[i] (log(nums[i])base10)+1 == count of any number
            if(count%2 == 0)
                values++;
            
        }
return values;

    }
}

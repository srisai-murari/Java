import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr = {-2, -3, -1, -5};
        int [] res = maxSubSum(arr);
        System.out.println(res[0]);
        for (int i = res[1]; i <= res[2]; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static int[] maxSubSum(int [] arr){
        int max = arr[0];
        int [] maxi = new int [2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];

                    if(sum > max){
                        max = sum;
                        maxi[0] = i;
                        maxi[1] = j;
                    }
                }
            }
        }
        return new int [] {max, maxi[0], maxi[1]};
    }

}

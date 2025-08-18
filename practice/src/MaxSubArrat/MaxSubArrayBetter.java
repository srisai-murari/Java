package MaxSubArrat;

public class MaxSubArrayBetter {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, -5, 4};
        int [] res = maxSubSum(arr);

        System.out.println(res[0]);
        for (int i = res[1]; i <= res[2] ; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static int [] maxSubSum(int [] arr){
        int max = arr[0];
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum > max) {
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        return new int[] {max, start, end};
    }
}

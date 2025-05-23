package bytePrograms;

public class nonRepeatedElementInArrayUsingXOR {
    public static void main(String[] args) {
        //finding element in an array that is not repeated twice
        int[] arr = {1,2,3,3,2,1,4};
        int n = 0;
        for (int j : arr) {
            n = j ^ n;
        }
        System.out.println(arr[n]);
    }
}

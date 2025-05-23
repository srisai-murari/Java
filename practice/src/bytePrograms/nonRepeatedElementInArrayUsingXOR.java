package bytePrograms;

public class nonRepeatedElementInArrayUsingXOR {
    public static void main(String[] args) {
        //finding element in an array that is not repeated twice
        int[] arr = {4,1,2,3,1,2,3};
        int n = 0;
        for (int j : arr) {
            n = j ^ n;
        }
        System.out.println(n);
    }
}

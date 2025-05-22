import java.util.*;

public class arraystostring {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for(int j : arr){
            System.out.print(j + " ");
        }

        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];

        str[0] = sc.next();

        System.out.println(str[0]);

    }
}

package Aon.test;
import java.util.*;
public class TCS3 {
    public static int subsetsCountWithSum(int[] nums, int index, int sum, int target) {

        if(index == nums.length)
            return sum == target ? 1 : 0;


        int including = subsetsCountWithSum(nums, index + 1, sum + nums[index], target);
        int excluding = subsetsCountWithSum(nums, index + 1, sum, target);

        return including + excluding;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        TCS3 obj = new TCS3();
        int c = subsetsCountWithSum(nums, 0, 0, target);

        System.out.println("Number of subsets with sum " + target + ": " + c);
    }
}

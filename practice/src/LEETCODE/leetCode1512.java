package LEETCODE;

public class leetCode1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(pairFinder(arr));
    }

    static int pairFinder(int[] arr){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j])
                    flag++;

            }
        }
        return flag;
    }

}

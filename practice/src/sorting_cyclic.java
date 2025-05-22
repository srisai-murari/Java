import java.util.Arrays;

public class sorting_cyclic {
    public static void main(String[] args) {
        int[] arr = cyclicSort();

    }

    static int[] cyclicSort() {
        //MOST USED WHEN GIVEN ARRAY STARTS FROM 1 TILL N
        //Time complexities             worst          best           average
        //                              O(N)
        int[] sorted = {4,3,2,7,8,2,3,1};
        int i = 0;
        while (i < sorted.length-1) {
            int cIndex = sorted[i] -1;
            //ignore the repeated values
            if(sorted[i] == sorted[cIndex]){
                i++;
                continue;
            }
            //to find missing number when the size of the array element is included
            //if any element in the array is equal to size of the array ignore it
            else if(sorted[i] == sorted.length){
                i++;
                continue;}

            //basic cyclic sort
            else if (sorted[i] - 1 != i) {
                int temp = sorted[i];
                sorted[i] = sorted[sorted[i] - 1];
                sorted[temp - 1] = temp;
                System.out.println(Arrays.toString(sorted));

            } else i++;


        }


        return sorted;
    }

}
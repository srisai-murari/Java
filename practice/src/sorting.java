import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] testArr1 = {4,25,21,5,13,14};
        int[] testArr2 = {};
        int[] testArr3 = {1,2,3,4,5};
        int[] testArr4 = {6,5,4,3,2,1};
        int[] testArr5 = {4,2,52,-1,-58,58};
        System.out.println("original array\n" + Arrays.toString(testArr5));
        System.out.println();
        System.out.println("Done using bubblesort\n" + Arrays.toString(bubbleSort(testArr5)));
        System.out.println();
        System.out.println("Done using selection sort\n" + Arrays.toString(selectionSort(testArr5)));
        System.out.println();
        System.out.println("Done using insertion sort\n" + Arrays.toString(insertionSort(testArr5)));
    }



    static int[] insertionSort(int[] arr) {//works well in small arrays
        //used most in partial sorted arrays
        //time complexities   best           worst         average
        //                    O(N)           O(N^2)         O(N^2)
        int [] sorted = arr.clone();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(sorted[j-1] > sorted[j]){
                    swap(sorted,j-1,j);
                }
                else break;
            }
        }

        return sorted;
    }

    static int[] selectionSort(int[] arr) { // good for small sized arrays
        //Complexities = best       worst        average
        //              O(n^2)      O(n^2)        O(n^2)
        int[] sorted = new int[arr.length];
        sorted = arr.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            int max = maxIndex(sorted, sorted.length - i);
            //                int temp = sorted[sorted.length-1 - i];
            //                sorted[sorted.length-1 - i] = sorted[max];
            //                sorted[max] = temp;
            swap(sorted, max, sorted.length-1-i);
        }
        return sorted;
    }
    static int maxIndex(int[] sorted,int length){
        int max = 0;
        for (int i = 0; i < length; i++) {
            if(sorted[max] <= sorted[i])
                max = i;
        }
        return max;}



    static int[] bubbleSort(int[] arr){
        //Time complexities       best        worst       average
        //                        O(n)        O(n^2)       O(n^2)
        //best case is possible only with the help of edge case written at line 52 (swap condition)
        int[] sorted = new int[arr.length];
        sorted = arr.clone();
        int n = sorted.length;
        for (int i = 0; i < n-1; i++) {
            boolean swap = false;
            for (int j = 1; j < n - i; j++) {
                if(sorted[j-1] > sorted[j]){
                    //                    int temp = sorted[j];
                    //                    sorted[j] = sorted[j-1];
                    //                    sorted[j-1] =  temp;
                    swap(sorted,j,j-1);
                    swap = true;
                }
            }
            if(!swap){//helps to attain best complexity
                System.out.println("array is either already sorted or it has been sorted before the completion of iterations");
                return sorted;
            }
        }
        return sorted;}
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}




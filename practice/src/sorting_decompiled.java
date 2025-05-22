//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Arrays;

public class sorting_decompiled {
    public static void main(String[] args) {
        int[] var10000 = new int[]{4, 25, 21, 5, 13, 14};
        int[] testArr2 = new int[0];
        var10000 = new int[]{1, 2, 3, 4, 5};
        var10000 = new int[]{6, 5, 4, 3, 2, 1};
        int[] testArr5 = new int[]{4, 2, 52, -1, -58, 58};
        System.out.println("original array\n" + Arrays.toString(testArr5));
        System.out.println();
        System.out.println("Done using bubblesort\n" + Arrays.toString(bubbleSort(testArr5)));
        System.out.println();
        System.out.println("Done using selection sort\n" + Arrays.toString(selectionSort(testArr5)));
        System.out.println();
        System.out.println("Done using insertion sort\n" + Arrays.toString(insertionSort(testArr5)));
    }

    static int[] insertionSort(int[] arr) {
        int[] sorted = arr.clone();

        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j > 0 && sorted[j - 1] > sorted[j]; --j) {
                swap(sorted, j - 1, j);
            }
        }

        return sorted;
    }

    static int[] selectionSort(int[] arr) {
        int[] sorted = new int[arr.length];
        sorted = arr.clone();

        for(int i = 0; i < sorted.length - 1; ++i) {
            int max = maxIndex(sorted, sorted.length - i);
            swap(sorted, max, sorted.length - 1 - i);
        }

        return sorted;
    }

    static int maxIndex(int[] sorted, int length) {
        int max = 0;

        for(int i = 0; i < length; ++i) {
            if (sorted[max] <= sorted[i]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int[] bubbleSort(int[] arr) {
        int[] sorted = new int[arr.length];
        sorted = arr.clone();
        int n = sorted.length;

        for(int i = 0; i < sorted.length - 1; ++i) {
            boolean swap = false;

            for(int j = 1; j < n - i; ++j) {
                if (sorted[j - 1] > sorted[j]) {
                    swap(sorted, j, j - 1);
                    swap = true;
                }
            }

            if (!swap) {
                System.out.println("array is either already sorted or it has been sorted before the completion of iterations");
                return sorted;
            }
        }

        return sorted;
    }
}

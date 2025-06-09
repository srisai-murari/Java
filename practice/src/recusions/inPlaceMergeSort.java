package recusions;

import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args) {
        int [] arr = {6,4,1,34,5,7,2};
        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int [] arr, int s, int e){
        if(e - s == 1)
            return;
        int m = (s + e)/2;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        mergerInPlace(arr, s, m, e);

    }
    static void mergerInPlace(int [] arr, int s, int m, int e){
        int [] merge = new int[e - s];
         int i = s;
         int j = m;
         int k = 0;
         while(i < m && j < e){
             if(arr[i] < arr[j]){
             merge[k] = arr[i];
             i++;
             }
             else{
                 merge[k] = arr[j];
                 j++;
             }
             k++;
         }
         while(i < m){
             merge[k] = arr[i];
             i++;
             k++;
         }
         while(j < e){
            merge[k] = arr[j];
            j++;
            k++;
         }
        for (int l = 0; l < merge.length; l++) {
            arr[l + s] = merge[l];
        }

    }
}

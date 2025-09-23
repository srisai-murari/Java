package Heaps;
//WITHOUT GENERICS AND 0-INDEXED
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxHeap {
    ArrayList<Integer> a = new ArrayList<>();
    static int index = -1;

    public MaxHeap(){
//        a.add(-1);
    }

    public int size () { return a.size(); }

    public void insert(int val){
        a.add(val);
        index++;

        int childIndex = index;

        while(childIndex > 0) {
            int parentIndex = (childIndex + 1) / 2 - 1;
            if (a.get(parentIndex) < a.get(childIndex)) {
                Collections.swap(a, parentIndex, childIndex);
                childIndex = parentIndex;
            }
            else  return;
        }
    }

    public int delete (){
        if(size() == 0){
            System.out.println("Nothing to delete");
            return -404;
        }

        int del = a.get(0);

        a.set(0, a.get(MaxHeap.index));
        a.remove(MaxHeap.index--);

        int index = 0;
        while (index <= MaxHeap.index){
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;

            if(left < a.size() && a.get(left) > a.get(largest)){
                largest = left;
            }

            if (right < a.size() && a.get(right) > a.get(largest)) {
                largest= right;
            }

            if(largest != index){
                Collections.swap(a, largest, index);
                index = largest;
            }
            else return del;
        }
        return del;
    }

    private void maxHeapify(int index, int [] arr, int size){
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if(left < size && arr[left] > arr[index])
            index = left;
        if(right < size && arr[right] > arr[index])
            index = right;

        if(index != largest){
            swap(arr, index, largest);
            maxHeapify(index, arr, size);
        }
        else return;
    }

    public void minHeapify(int index, int [] arr){
        int smallest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if(left < arr.length && arr[left] < arr[index])
            index = left;
        if(right < arr.length && arr[right] < arr[index])
            index = right;

        if(index != smallest){
            swap(arr, index, smallest);
            minHeapify(index, arr);
        }
    }

    private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void display(){
        for (int i = 0; i <= index; i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap();

        mh.insert(70);
        mh.insert(60);
        mh.insert(30);
        mh.insert(80);
        mh.insert(90);
        mh.insert(20);
        mh.insert(100);

        mh.display();
        int size = mh.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(mh.delete());
        }

        System.out.println();

        int [] arr = {54, 53, 55, 52, 50};
        maxHeapify(arr, arr.length);
        int [] arr2 = {54, 53, 55, 52, 50};
        minHeapify(arr2);
        int [] arr3 = {54, 53, 55, 52, 50};
        heapsort(arr3);
        System.out.println(Arrays.toString(arr3) + "sorted") ;

    }

    static void heapsort(int [] arr){
        int size = arr.length;
        maxHeapify(arr, arr.length);

        while(size > 0){
            swap(arr, 0, --size);
            maxHeapify(arr, size);
        }
    }
    static void maxHeapify(int [] arr, int n){
        System.out.println(Arrays.toString(arr) + "before");

        MaxHeap mh = new MaxHeap();
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            mh.maxHeapify(i, arr, n);
        }

        System.out.println(Arrays.toString(arr));
    }


    static void minHeapify(int [] arr){
        System.out.println(Arrays.toString(arr) + "before");

        MaxHeap mh = new MaxHeap();
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            mh.minHeapify(i, arr);
        }

        System.out.println(Arrays.toString(arr));
    }


}

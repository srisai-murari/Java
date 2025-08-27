package Concepts;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        heap h = new heap();
        h.insert(10);
        h.insert(12);
        h.insert(7);
    }
}


class heap {
    private ArrayList<Integer> a;
    private int index = 1;

    public heap(){
        a = new ArrayList<>();
    }

    public void insert(int val) {
        a.add(val);
        upHeap(a.size() - 1);
    }

    public void upHeap(int index) {
        if (index == 0) return;

        int parent = parent(index);

        if(a.get(parent) > a.get(index)){
            swap(parent, index);
            upHeap(parent);
        }
    }

    public int remove (int index){
        if(a.isEmpty()){
            System.out.println("Cannot remove");
            return -1;
        }

        int temp = a.get(0);


        int last = a.remove(a.size() - 1);

        if(!a.isEmpty()) {
            a.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap (int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < a.size() && a.get(min) > a.get(left)) {
            min = left;
        }
        if(right < a.size() && a.get(min) > a.get(right)) {
            min = right;
        }

        if(min != index){
            swap(min, index);
            downHeap(min);
        }

    }


    private int parent (int index){
        return (index - 1) / 2;
    }
    private int left (int index){
        return 2 * (index) + 1 ;
    }

    private int right (int index){
        return 2 * (index) + 2;
    }

    private void swap (int i, int j){
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, a.get(temp));
    }

}

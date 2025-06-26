package oops.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//// NOTE : At compile time the code is converted to bytecode
/// this bytecode consists of only instances, methods and variables
/// AND THIS BYTECODE DOESN'T CONTAIN GENERIC VARIABLES
/// so at runtime where objects are being initialized it checks what this generic variable denotes
/// and it has no idea what this variable does. So then you face an error
// eg : nums = new T[SIZE];
//    👆👆 runs at compile time
//    things after new are made at runtime
//    at that runtime java has no idea what T is

public class GenCustomArrayList<T> {

        private Object[] data;
        private static int SIZE = 10;
        private static int index_size;

        public GenCustomArrayList(){
            data = new Object[SIZE];
        }

        public void add(T val){
            if(isFull())
                resize();
            data[index_size++] = val;

        }

        private void resize(){
            Object [] temp = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        private boolean isFull(){
            return index_size == data.length;
        }

        public T get(int index){
            return (T) data[index];

        }

        public void set(int index, T value){
            data[index] = value;

        }


        public T remove(){
            T removed = (T)(data[index_size - 1]);
            this.data[--index_size] = 0;
            return removed;
        }

        public int size(){
            return index_size;
        }

    @Override
    public String toString() {
        return "GenCustomArrayList{" +
                "data=" + Arrays.toString(data) + "size = " + index_size +
                '}';
    }

    public static void main(String [] args){
        GenCustomArrayList<String> list = new GenCustomArrayList<>();

        list.add("fda");
        list.add("sda");
        list.add("af");
        System.out.println(list.remove());

        System.out.println(list);




        }



    }

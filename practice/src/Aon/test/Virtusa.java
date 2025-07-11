package Aon.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Virtusa {
    public static void main(String[] args) {
        int [] books = {54, 76, 89, 123, 12};

        System.out.println(Arrays.toString(books));

        primeSort(books);

        System.out.println(Arrays.toString(books));
    }

    static void primeSort(int [] books){
        boolean [] prime = {false, false, true, true, false, true, false, true, false, false};
        int [] count = new int [books.length];
        for (int i = 0; i < books.length; i++) {
            count[i] = countPrimes(books[i], prime);
        }
        //bubble sort
        for (int i = 0; i < books.length; i++) {
            for (int j = 1; j < books.length; j++) {
                if (count[j - 1] > count[j] || count[j - 1] == count[j] && books[j - 1] > books[j])
                    swap(books, count, j - 1, j);
            }

        }
    }

    static void swap(int [] books, int [] count, int i, int j){
        //swap books
        int temp = books[i];
        books[i] = books[j];
        books[j] = temp;

        temp = count[i];
        count[i] = count[j];
        count[j] = temp;
    }

    static int countPrimes(int val, boolean [] prime){
        int count = 0;
        int rem = 0;
        while(val > 0){
            rem = val % 10;
            if(prime[rem])
                count++;
            val = val / 10;
        }
        return count;
    }

}

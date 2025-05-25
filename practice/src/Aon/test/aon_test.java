package Aon.test;

import java.util.*;

public class aon_test {
    static boolean isprime(int n){
        if(n < 0) return false;
        boolean flag =true;
        for (int i = 2; i*i <= n ; i++) {
            if(n%i ==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    static int sumprime(int n){
        int temp = n;
        int sum = 0;
        int num =0;
        while(temp>0){
            num = temp %10;
            temp = temp/10;
            sum = num + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        //array initialization and declaration
        int[] arr = new int[n];
        System.out.println("Enter values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //prime arrays
        boolean[] primearr = new boolean[arr.length];
        int[] sumprime = new int[arr.length];
        boolean[] checkprime = new boolean[arr.length];


        for (int i = 0; i < arr.length; i++) {
            primearr[i] = isprime(arr[i]);  //checking whether elements in main array are prime or not {true or false}
            sumprime[i] = sumprime(arr[i]); // adding "numbers of same element" in the array {integers}
            checkprime[i] = isprime(sumprime[i]);// checking whether "sum of individual numbers of same element" is prime or not
        }


//        for (int i = 0; i < n ; i++) {
//            System.out.println(arr[i] + " " + primearr[i] + " " + sumprime[i] + " " + checkprime[i]);
//
//        }
        for (int i = 0; i < arr.length; i++) {
            if(primearr[i] && checkprime[i]){
//                System.out.println(arr[i] + " sum of arr is " + sumprime[i] + " Yes both are true");
                if(i==0 || i== arr.length-1){
                    if(i==0){
                        if(arr[i+1]%arr[i] == 0 ){
                            flag += 1;
                            System.out.println(arr[i] + " is a prime, sum is prime and neighbors are multiples of " + arr[i]);
                        }
                    }

                    if(i== arr.length-1){
                        if(arr[i] % arr[i-1] == 0){
                            flag += 1;
                            System.out.println(arr[i] + " is a prime, sum is pri5 me and neighbors are multiples of " + arr[i]);
                    }}
                }
                else{
                    if(arr[i+1]% arr[i] ==0 && arr[i-1] % arr[i] == 0){
                        flag += 1;
                        System.out.println(arr[i] + " is a prime, sum is prime and neighbors are multiples of " + arr[i]);}
                }

            }

        }
        System.out.println("No. of special numbers are " + flag);

//        int n =5;
//        int n;
//        n = sc.nextInt();
//        if(isprime(n)){
//            System.out.println(n + " is prime");
//
//        }
//        else
//            System.out.println(n + " Is not prime");
   }

    }
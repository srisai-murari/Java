package Patterns;

import java.util.Scanner;

public class patterns6to10 {
    public static void main(String[] args) {
//        pattern6();
//        pattern7();
//        pattern8();
//        pattern9();
        pattern10();
    }

    static void pattern6() {
/*
    *
   **
  ***
 ****
*****
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int spaces = rows - i;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern7(){
/*
 *****
  ****
   ***
    **
     *
 */

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int spaces = i ;
            for (int j = 1; j < spaces ; j++) {
                System.out.print(" ");
            }
            for (int k = rows; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(){
/*
    *
   ***
  *****
 *******
*********
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int spaces = rows-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }



    }
    static void pattern9(){
/*
*********
 *******
  *****
   ***
    *
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            int spaces = rows-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(){
/*
    *
   * *
  * * *
 * * * *
* * * * *
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int spaces = rows-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                if(j%2 != 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }


    }


}

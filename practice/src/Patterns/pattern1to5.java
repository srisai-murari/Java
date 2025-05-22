package Patterns;
import java.util.Scanner;
public class pattern1to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        pattern_one();
//        pattern_two();
//        pattern_three();
//        pattern_four();
        pattern_five();
    }
    
    static void pattern_one(){
        /* ****
           ****
           ****
           ****
           ****
         */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    static void pattern_two(){
/*
*
**
***
****
*****
  */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void pattern_three(){
/*
 *****
 ****
 ***
 **
 *
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i  ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void pattern_four(){
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    static void pattern_five(){
/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 * 
        
 */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols =  0 ;
//kunals
        for (int i = 1; i <= 2*rows; i++) {
            cols = i > rows ? 2*rows - i : i;
            for (int j = 1; j <= cols ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("________________________________________");
//        self
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < rows ; i++) {
            for (int j = rows; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

package Recursions;

public class RecursionL1 {
  public static void main(String[] args) {
    int n = fibo(9);

    System.out.println(n);
    System.out.flush();
  }

  static int fibo(int n){
    if(n == 0 || n == 1)
      return n;

    return fibo(n - 1) + fibo(n - 2);
  }
}
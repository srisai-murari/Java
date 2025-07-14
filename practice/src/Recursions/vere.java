package Recursions;

class vere {
  public static void main(String[] args) {
    System.out.println(rev(-20202, 4));

    //can use math.log
    int noOfDigits = (int)(Math.log10(2020))+ 1;
    System.out.println(noOfDigits);

    System.out.println(palindrome(202));

    System.out.println(palin("2022", 0, 3));


    System.out.println(0b0100);
    System.out.println(count0(01000, 0));
    System.out.println(count0(1000, 0));

    System.out.println("Blank");

  }

  static boolean palindrome(int n){
    if(n == rev(n, (int) Math.log10(n)))
      return true;
    return false;
      
  }
  static void print(int n) {
    if (n == 0) {
      return;
    }

    print(n - 1);

    System.out.print(n + " ");

  }

  static int sumOfDigits(int n){
    if (n == 0){
      return n;
    }       
    return n % 10+ sumOfDigits(n / 10);
  }

  static int rev(int n, int pow){
    if(n == 0)
      return n;

 
    return (int) ((n % 10) * Math.pow(10, pow)) + rev(n / 10, pow - 1); 
  }


  static boolean palin(String n, int start, int end){
    if(start == end || end - start == 1 && n.charAt(start) == n.charAt(end))
      return true;

    if(n.charAt(start) != n.charAt(end))
      return false;
    return palin(n, start + 1, end - 1);
    
  }

  static int count0(int n, int count) {

    if(n == 0)
      return count;

    
    if(n % 10 == 0)
     return count0(n / 10, count+1);

    return count0(n / 10, count);
  }
}
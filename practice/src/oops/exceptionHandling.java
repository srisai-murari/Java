package oops;

public class exceptionHandling {
    public static void main(String[] args) throws Exception {
        int a = 190;
        int b = 0;

        try{
//            divide(a,b);
            throw new Exception("fun");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }



    static int divide(int a, int b) throws Exception{
        if(b == 0){
            throw new ArithmeticException("0 iruku");
        }

        return a/b;
    }
}

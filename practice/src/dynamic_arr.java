import java.util.ArrayList;
import java.util.Scanner;
public class dynamic_arr
{
    public static void main(String[] args) {
//        Scanner  sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        ArrayList<Integer> lisp = new ArrayList<>(1);
//        for (int i = 0; i < size; i++) {
//            lisp.add(sc.nextInt());
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(lisp.get(i) + " ");
//        }
//        System.out.println(lisp);
//
//


        dynami();
    }

    static void dynami(){
        Scanner sc  = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0; i< 4;i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 4; i++) {
            for(int j =0; j<4; j++){
                list.get(i).add(sc.nextInt());
            }

        }
        System.out.println(list);

    }
}

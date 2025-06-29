package Aon.test;
import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();


        float [] marks = new float[n + 1];


        for(int i = 0; i < n; i++){
            marks[i] = sc.nextFloat();
        }


        System.out.println("input array " + Arrays.toString(marks));

        System.out.println("give index and value you want to insert");
        int index = sc.nextInt();
        float val = sc.nextFloat();

        //moving elements till index
        for(int i = n; i >= index - 1; i--){
            if(i == index - 1)
                marks[i] = 0;
            else
                marks[i] = marks[i - 1];
        }
        marks[index - 1] = val;
        //moved till in dex

        System.out.println("after moving elements in array " + Arrays.toString(marks));



        int []check = new int [marks.length];
        for(int i = 0; i < marks.length; i++){
            int count = 0;
            for(int j = 0;  j < marks.length ; j++){
                if(marks [i] == marks[j]){
                    count++;
                    check[j]++;
                }

            }

        }
        System.out.println(Arrays.toString(check));

        ArrayList<Float> duplicateList = new ArrayList<>();
        for(int i = 0; i < marks.length; i++){
            if(check[i] > 1)
                if(!duplicateList.contains(marks[i])){
                   duplicateList.add(marks[i]);
                }
        }

        System.out.println(duplicateList);



    }
}

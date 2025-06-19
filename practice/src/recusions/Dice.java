package recusions;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        List<String> dicee = diceRet("", 4);
        List<Integer> IntegerArrayListAns = arrayListStrToIntegerList(dicee);
        System.out.println(IntegerArrayListAns);
        int [] ansArray = IntegerList_to_IntegerArray(IntegerArrayListAns);
        System.out.println(Arrays.toString(ansArray));

        dice("", 4);


    }
    static void dice(String p, int target){
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    //ret arg
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }
    //convert that string to integer

    static List<Integer> arrayListStrToIntegerList(List<String> ans){
        List<Integer> intAns = new  ArrayList<>();
        for (int i = 0; i < ans.size(); i++) {
            String str = ans.get(i);
//            intAns.add(Character.getNumericValue(str)); // to convert a character to number use
            //Character.getNumericValue(character);
            intAns.add(Integer.parseInt(str));
            }
        return intAns;
    }

    static int [] IntegerList_to_IntegerArray(List<Integer> listAns){
        int [] ans = new int[listAns.size()];

        for (int i = 0; i < listAns.size(); i++) {
            ans[i] = listAns.get(i);
        }
        return ans;

    }
}

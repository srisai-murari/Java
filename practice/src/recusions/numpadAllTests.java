package recusions;
import java.util.*;
public class numpadAllTests {
    public static void main(String[] args) {
        String inp = "78";
//        int dig = Character.getNumericValue(inp.charAt(0));
//        System.out.println(dig);
//        System.out.println(inp.charAt(0) + '0');
        List<String> ans = letterCombo(inp);
        System.out.println(ans);



        



    }
    static List<String> letterCombo(String digits){

        if(digits.isEmpty())
            return new ArrayList<>();

        List<String> ans = letterComboHelperActual("", digits);

        return ans;
    }

    static List<String> letterComboHelper(String p, String digits){
        if(digits.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = digits.charAt(0) - '0' ;


        List<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            List<String> ans1 = letterComboHelper(p + ch, digits.substring(1));
            ans.addAll(ans1);
        }
        return ans;
    }
    static List<String> letterComboHelperActual(String p, String digits){
        if(digits.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = digits.charAt(0) - '0' ;
        List<String> ans = new ArrayList<>();
        if(digit - 1 <= 0){
            List<String> ans1 = letterComboHelperActual(p, digits.substring(1));
            ans.addAll(ans1);
            return ans;
        }
        if(digit == 7){
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                List<String> ans1  = letterComboHelperActual(p + ch, digits.substring(1));
                ans.addAll(ans1);
            }
            return ans;
        }
        if(digit == 8){
            for (int i = 19 ; i < 22; i++) {
                char ch = (char) ('a' + i);
                List<String> ans1  = letterComboHelperActual(p + ch, digits.substring(1));
                ans.addAll(ans1);
            }
            return ans;
        }
        if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i < ((digit - 1) * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                List<String> ans1  = letterComboHelperActual(p + ch, digits.substring(1));
                ans.addAll(ans1);
            }
            return ans;
        }

        for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
            char ch = (char) ('a' + i);
            List<String> ans1  = letterComboHelperActual(p + ch, digits.substring(1));
            ans.addAll(ans1);
        }

        return ans;
    }


//only one recursion call less time complexity
    public static List<String> solve(String p, String up) {

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }

        ArrayList<String> list = new ArrayList<>();

        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(p +ch, up.substring(1)));
        }

        return list;

    }

}

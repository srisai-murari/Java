package Recursions.Permutations;
import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println();

        System.out.println(permutationsCount("", "abc", 0));

        System.out.println(permutationsRet("", "abc", new ArrayList<>()));

        System.out.println(permutationsRet("", "abc"));

        List<List<String>> List = new ArrayList<>();

        System.out.println(permutationsListOfList("", "abc", List));

        System.out.println(permutationsListOfList("", "123"));


        int[] nums = {0, -1, 1};               ;
        List<Integer> up = new ArrayList<>();
        for (int num : nums) {
            up.add(num);
        }
        System.out.println(up);
//        System.out.println(Arrays.toString(nums));
        System.out.println(helper(new ArrayList<>(), up));
    }
/// with void ret type
    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int n = p.length();
        for (int i = 0; i < n + 1; i++) {//loop is for adding elements at diff positions by using diff calls
            permutations(p.substring(0,i) + up.charAt(0) + p.substring(i, n), up.substring(1));
        }
    }

/// with ret type
    public static List<String> permutationsRet(String p, String up, List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        int n = p.length();
        for (int i = 0; i < n + 1; i++) {
            permutationsRet(p.substring(0, i) + up.charAt(0) + p.substring(i, n), up.substring(1), ans);
        }
        return ans;
    }

/// with ret type but ans not in argument
    public static List<String> permutationsRet(String p, String up){
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        int n = p.length();
        for (int i = 0; i < n + 1; i++) {
            ans.addAll(permutationsRet(p.substring(0,i) + up.charAt(0) + p.substring(i,n), up.substring(1)));
        }

        return ans;
    }

///storing in list<list<String>> in argument

    public static List<List<String>> permutationsListOfList (String p, String up, List<List<String>> finAns){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            finAns.add(list);
            return finAns;
        }

        List<String> ans = new ArrayList<>();
        int n = p.length();
        for (int i = 0; i < n + 1; i++) {
            permutationsListOfList(p.substring(0, i) + up.charAt(0) + p.substring(i, n), up.substring(1), finAns);
        }

        return finAns;
    }

    public static List<List<String>> permutationsListOfList(String p, String up){
        List<List<String>> outer = new ArrayList<>();
        if(up.isEmpty()){
            List<String> inner = new ArrayList<>();
            inner.add(p);
            outer.add(inner);
            return outer;
        }

        int n = p.length();
        for (int i = 0; i < n + 1; i++) {
            outer.addAll(permutationsListOfList(p.substring(0, i) + up.charAt(0) + p.substring(i, n), up.substring(1)));
        }
        return outer;

    }

///  return count
public static int permutationsCount(String p, String up, int count){
    if(up.isEmpty()){
        count++;
        return count; //or js return 1 and store it in count = count + rec call
    }

    int n = p.length();
    for (int i = 0; i < n + 1; i++) {
       count =  permutationsCount(p.substring(0,i) + up.charAt(0) + p.substring(i, n), up.substring(1),count);
    }
    return count;
}

    public static List<List<Integer>> helper(List<Integer> p, List<Integer> up){
        List<List<Integer>> outer = new ArrayList<>();

        if(up.isEmpty()){
            outer.add(new ArrayList<>(p));
            return outer;
        }

        int n = p.size();
        for(int i = 0; i < n + 1; i++){
            List<Integer> newP = new ArrayList<>(p);
            newP.add(i, up.get(0));
//            outer.addAll(helper(p.substring(0, i) + up.charAt(0) + p.substring(i, n), up.substring(1)));
            List<Integer> newUP = new ArrayList<>(up.subList(1, up.size()));

            outer.addAll(helper(newP, newUP));
        }

        return outer;
    }


}

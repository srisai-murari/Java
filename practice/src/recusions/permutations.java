package recusions;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = retPerm("", "123");
        //convert ans arraylist to list of list

        List<List<Integer>>  finalAns = new ArrayList<>();
        for(int i = 0; i < ans.size(); i++){
            String st = ans.get(i);
            int val = Integer.parseInt(st);

            List<Integer> temp = new ArrayList<>();
            temp.add(val);
            finalAns.add(temp);
        }
        System.out.println(finalAns);

        System.out.println(ans);
        perm("", "abs");

//        System.out.println(count("", "abs"));
    }
    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for (int i = 0; i <= n ; i++) {
            String s = p.substring(0,i);
            String e = p.substring(i, n);
            perm(s + ch + e, up.substring(1));

        }





    }
    //returning an integer list

    //returning an argument
    private static ArrayList<String> retPerm(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            ArrayList<String> ans1 = retPerm(s + ch + e, up.substring(1));
            ans.addAll(ans1);
        }
        return ans;
    }
    static int count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i);
            count = count + count(s + ch + e, up.substring(1));

        }
        return count;

    }

}

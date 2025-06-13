package recusions;

import java.util.ArrayList;

public class subSequences {
    public static void main(String[] args) {
        String s = "abc";

        allSubStrings("", s);

        ArrayList<String> n = new ArrayList<>();
        ArrayList<String> ans = allSubStrings("", s, n);
        int last = ans.size() - 1;
//        System.out.println(last);
        ans.remove(last);
        System.out.println(ans);

        ArrayList<String> ans1 = allSubStringsNoALinArg("", s);
//        if(ans1.getFirst() == " "){
//            int index = 1;
//            System.out.println(ans1.getFirst());
//            ans1.remove(index);
//        }
//        else {
//            int index = ans1.size() - 1;
//            ans1.remove(index);
//        }
        ans1.remove("");
        System.out.println(ans1);


    }
    private static void allSubStrings(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        allSubStrings(p + ch , up.substring(1));
        allSubStrings(p, up.substring(1));

    }
    //list not in argument
    private static ArrayList<String> allSubStringsNoALinArg(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = allSubStringsNoALinArg(p+ch, up.substring(1));
        ArrayList<String> right = allSubStringsNoALinArg(p, up.substring(1));
        right.addAll(left);
        return right;

    }
    private static ArrayList<String> allSubStrings(String p, String up, ArrayList<String> s) {
        if(up.length() == 0) {
            s.add(p);
            return s;
        }
        char ch = up.charAt(0);

         allSubStrings(p + ch , up.substring(1), s);
         allSubStrings(p, up.substring(1),s );
    return s;
    }

}

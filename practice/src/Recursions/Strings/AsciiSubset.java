package Recursions.Strings;

import java.util.ArrayList;
import java.util.List;

public class AsciiSubset {
    public static void main(String[] args) {

        List<String> ans = subsetIncludingAsciiRet("", "abc");

        System.out.println(ans);

    }

    //subsets that include ascii values

    public static void subsetIncludingAscii (String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        subsetIncludingAscii(p + up.charAt(0), up.substring(1));
        subsetIncludingAscii(p, up.substring(1));

        subsetIncludingAscii(p + "←→" + (up.charAt(0) - 0) , up.substring(1));
    }

    //including ascii with ret

    public static List<String> subsetIncludingAsciiRet(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }

        List<String> left = subsetIncludingAsciiRet(p + up.charAt(0), up.substring(1));

        List<String> right = subsetIncludingAsciiRet(p, up.substring(1));

        List<String> ascii = subsetIncludingAsciiRet(p + (up.charAt(0) - 0), up.substring(1));

        left.addAll(right);
        left.addAll(ascii);

        return left;

    }
}

package Recursions.Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(skipRet("baaabccad", ""));


        System.out.println(skip("baaabccad"));
    }

    public static void skip(String up, String p) {
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }


        if(p.charAt(0) == 'a'){
            skip(up, p.substring(1));
        }
        else skip(up + p.charAt(0), p.substring(1));
    }

    public static String skipRet(String up, String p) {
        if(up.isEmpty()){
            return p;
        }


        if(up.charAt(0) == 'a'){
            return skipRet(up.substring(1), p);
        }
        else return skipRet(up.substring(1), p + up.charAt(0));

//        return p;
    }


    public static String skip(String s){
        String p = "";
        if(s.isEmpty()){
            return p;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return skip(s.substring(1));
        }
            return ch + skip(s.substring(1));

//
//        if(ch == 'a'){
//            p = skip(s.substring(1));
//        }
//        else p = ch + skip(s.substring(1));
//
//        return p;

    }
}

package Recursions.Strings;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("jumponlyjumpjumperjumping"));
    }

    //using ans in parameters
    public static void skipString(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }


        if(up.startsWith("jump")){
            skipString(p, up.substring(4));
        }
        else skipString(p + up.charAt(0), up.substring(1));
    }

    //returning the string
    public static String skipStringRet(String p, String up){
        if(up.isEmpty()){
            return p;
        }


        if(up.startsWith("jump")){
            return skipStringRet(p, up.substring(4));
        }
        else return skipStringRet(p + up.charAt(0), up.substring(1));

    }

    //returning string with no ans in argument

    public static String skipString(String s){
        if(s.isEmpty())
            return "";

        if(s.startsWith("jump")){
            return skipString(s.substring(4));
        }
        else return s.charAt(0) + skipString(s.substring(1));
    }

}

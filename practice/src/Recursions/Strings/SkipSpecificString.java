package Recursions.Strings;

public class SkipSpecificString {
    public static void main(String[] args) {
        //skip specific string like
//    skip jump but dont skip if it is jumper or jumping
        System.out.println(specificSkipRet("jumponlyjumpjumperjumping"));
    }

    public static void specificSkip(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if((up.startsWith("jump") && (!up.startsWith("jumper") && (!up.startsWith("jumping")))))
            specificSkip(p, up.substring(4));
        else specificSkip(p + up.charAt(0), up.substring(1));
    }

    public static String specificSkipRet(String p, String up) {

        if(up.isEmpty()){
            return p;
        }

        if((up.startsWith("jump") && (!up.startsWith("jumper") && (!up.startsWith("jumping")))))
             return specificSkipRet(p, up.substring(4));
        else return specificSkipRet(p + up.charAt(0), up.substring(1));

    }

    public static String specificSkipRet(String s) {

        if(s.isEmpty()){
            return "";
        }

        if((s.startsWith("jump") && (!s.startsWith("jumper") && (!s.startsWith("jumping")))))
            return specificSkipRet(s.substring(4));
        else return s.charAt(0) + specificSkipRet(s.substring(1));

    }


}

package recusions;

public class skip {
    public static void main(String[] args) {
        String str = "anbajaje";
//for pointer and passing a stringbuilder
        StringBuilder sb = new StringBuilder();
        System.out.println(remA(str,sb, 0));

//passing string as well as empty answer string
        System.out.println(rem("", str));
//passing only given string and returning new string
        System.out.println(remSingleArg(str));

        //SKIP STRING;
        String s = "dakjdfappledfkj";
        System.out.println(remString(s));
        System.out.println(skipApple(s));

        //SKIP APPLE ONLY IF ITS NOT APPLEJUICE

        String str1 = "dkjfaapplejuicekfajlapple";
        System.out.println(skipAppleWCondition(str1));

    }

    private static String skipAppleWCondition(String str) {
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if(str.startsWith("apple") && !str.startsWith("applejuice")) return skipAppleWCondition(str.substring(5));
        else return ch + skipAppleWCondition(str.substring(1));
    }

    private static String remString(String remJK) {
        if(remJK.isEmpty())
            return "";
        if(remJK.startsWith("apple")) {
            return remString(remJK.substring(5));
        }
        else return remJK.charAt(0) + remString(remJK.substring(1));
    }


    private static String rem(String ans,String str) {
        if(str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);
        if(ch == 'a')
            return rem(ans, str.substring(1));
        else{
            return rem(ans + ch, str.substring(1));
        }
    }
    private static String remSingleArg(String str) {
        if(str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a')
            return remSingleArg(str.substring(1));
        else{
            return ch + remSingleArg(str.substring(1));
        }
    }


    private static String remA(String str, StringBuilder sb, int i) {
        if(i == str.length())
            return sb.toString();
        if(str.charAt(i) != 'a'){
            sb.append(str.charAt(i));
            return remA(str, sb, ++i);
        }
        else
            return remA(str, sb, ++i);
    }

    private static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        String s = "apple";
        if(str.startsWith(s)) return skipApple(str.substring(5));
        else return ch + skipApple(str.substring(1));
    }
}

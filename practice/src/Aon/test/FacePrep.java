package Aon.test;

public class FacePrep {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("azxxzy");
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(StringBuilder sb, boolean madeChanges){
        if(!madeChanges){
            return sb.toString();
        }

        madeChanges = false;

        for (int i = 1; i < sb.length(); i++) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i - 1);

            if(ch1 == ch2) {
                madeChanges = true;
                sb.delete(i - 1, i + 1);
            }
        }
        String res = removeDuplicates(sb, madeChanges);
        return res;
    }

    private static String removeDuplicates(StringBuilder sb){


        for (int i = 1; i < sb.length(); i++) {
            char ch2 = sb.charAt(i - 1);
            char ch1 = sb.charAt(i);

            if(ch1 == ch2) {
                sb.delete(i - 1, i + 1);
                i-=2;
            }
        }
        return sb.toString();
    }

}

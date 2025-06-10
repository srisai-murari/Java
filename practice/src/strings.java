import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String str = "";
        char ch = 'a';
        StringBuilder bestStr = new StringBuilder();//mutable arrays
        for (int i = 0; i < 26; i++) {
            ch = 'a';
            ch = (char)('a' + i) ;
            System.out.print(ch + " ");
//            str += ch; // not a good practice as it creates a new object everytime its called

//solution
            bestStr = bestStr.append(ch);
            bestStr = bestStr.append(" ");
        }
        System.out.println();
        System.out.println(bestStr);

        Integer n = new Integer (121);
        System.out.println(n.toString());
        String s = "abcdef";
//        System.out.println(Arrays.toString(s.toCharArray()));
        StringBuilder SB = new StringBuilder();
        char c = 1;
        char[] cha = s.toCharArray();
        System.out.println(cha[5]);

        for (int i = cha.length-1; i > 0; i--) {
            SB = SB.append(cha[i]);

        }
        System.out.println();


        //using string builder
        String orgstr = "abcba";
        StringBuilder strr = new StringBuilder(orgstr);
        System.out.println(orgstr);
        System.out.println(strr);
        strr = strr.reverse();
        StringBuilder ssss = new StringBuilder();
        ssss.append((char)('A' +25));
        System.out.println(ssss + " this is sbbbbbbbbb");
        System.out.println();
        System.out.println(strr);
        System.out.println(orgstr.equals(strr.toString()));
        System.out.println();




        }

    }




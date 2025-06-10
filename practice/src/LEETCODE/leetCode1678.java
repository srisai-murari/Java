package LEETCODE;

import java.sql.SQLOutput;

public class leetCode1678 {
    public static void main(String[] args) {
        String command = "G()()(al)";
        System.out.println(replacer(command));
        System.out.println(singleLineReplacer(command));
    }

    private static String singleLineReplacer(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    private static String replacer(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                sb.append(command.charAt(i));
            }
            else if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    sb.append('o');
                    i++;
                }
                else if(command.charAt(i + 1) == 'a'){
                    sb.append("al");
                    i += 2;
                }
            }



            i++;
        }
        return sb.toString();
    }
}

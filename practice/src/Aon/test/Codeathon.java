package Aon.test;

public class Codeathon {
    public static void main(String[] args) {
        String s = "Captaincaptain";
        String p = "cap";

        s = s.toLowerCase();


        int i = 0;
        while (i < s.length()){
            int index = s.indexOf(p, i);
            if(index == -1){
                if(i == 0)
                    System.out.println("Not found");
                break;
            }
            else {
                i = p.length() + index;
            }
            System.out.println(index + 1);

        }
    }
}

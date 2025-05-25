package recusions;

public class palindrome {
    public static void main(String[] args) {
        long a = 12340432;
        String str = Long.toString(a);
        char[] ch = str.toCharArray();
        boolean v = pal(ch,0, ch.length-1);
        System.out.println(v);
    }

    static boolean pal(char[] ch, int start, int end) {
        if(ch[start] != ch[end])
            return false;
        if(start > end)
            return true;
        return true &  pal(ch, start + 1,end -1);
    }
}

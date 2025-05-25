package bytePrograms;

public class rangeXOR {
    public static void main(String[] args) {
        int from =3, till = 9;
        System.out.println(findXORofA(till));
        System.out.println(findXORofA(from-1));
        System.out.println(findXORofA(till) ^ findXORofA(from-1));
    }

    private static int findXORofA(int a) {
        int answer = 0;
        if(a%4 == 0)
            return a;
        if(a%4 == 1)
            return 1;
        if(a%4 == 2)
            return a+1;
        else return 0;

    }
}

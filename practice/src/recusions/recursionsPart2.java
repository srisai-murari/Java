package recusions;

public class recursionsPart2 {
    public static void main(String[] args) {
        System.out.println("printing rev");
        printrev(6);
        System.out.println();
        System.out.println("printing straight");
        printstraight(6);
    }

    private static void printrev(int i) {
        if(i == 0)
            return;
        System.out.print(i + " ");
        printrev(i-1);
    }

    private static void printstraight(int i) {
        if(i==0)
            return;
        printstraight(i-1);
        System.out.print(i + " ");
    }
}

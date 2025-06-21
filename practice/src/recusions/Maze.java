package recusions;
import java.util.ArrayList;
import java.util.List;
public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeRetStr("", 3,3));
        maze("", 3, 3);
        System.out.println(count(3, 4));
        System.out.println();

        mazeDiagonal("", 3, 3);
        System.out.println(countDiagonal(3,3));

    }

    static void maze(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if ((row - 1) != 0) {
            maze(p + 'D' + " ", row - 1, col);
        }
        if ((col - 1) != 0)
            maze(p + 'R' + " ", row, col - 1);

    }

    static void mazeDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if ((row - 1) != 0) {
            mazeDiagonal(p + 'D' + " ", row - 1, col);
        }
        if (row - 1 != 0 && col - 1 != 0) {
            mazeDiagonal(p + 'C' + " ", row - 1, col - 1);
        }
        if ((col - 1) != 0)
            mazeDiagonal(p + 'R' + " ", row, col - 1);

    }

    //return String list
    static List<String> mazeRetStr(String p, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();

        if ((row - 1) != 0)
            ans.addAll(mazeRetStr(p + 'D', row - 1, col));
        if ((col - 1) != 0)
            ans.addAll(mazeRetStr(p + 'R', row, col - 1));

        return ans;
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static int countDiagonal(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int diagonal = countDiagonal(row - 1, col - 1);
        int left = countDiagonal(row - 1, col);
        int right = countDiagonal(row, col - 1);


        return diagonal + left + right;

    }
}
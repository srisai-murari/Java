package recusions;
import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = retPerm("", "123");
        System.out.println(ans);
        perm("", "123");
        //convert ans arraylist to list of list

        List<List<Integer>> finalAns = convertToIntegerLists(ans);

        System.out.println(finalAns);

        //without ret type
//        perm("", "abs");

//printing combinations of a number array
        int [] arrr = {1,2,3};
        List<List<Integer>> anss = retPerm(arrr);
        System.out.println(anss);

//        converting an integer to string and string to integer
        int ex = 122;
        String intToStr = Integer.toString(ex);

        System.out.println(ex);
        for (int i = intToStr.length() - 1; i >= 0; i--) {
            System.out.print(intToStr.charAt(i));


        }

    }
    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for (int i = 0; i <= n; i++) {
            String s = p.substring(0, i);
            String e = p.substring(i, n);
            perm(s + ch + e, up.substring(1));

        }


    }

    //returning an argument
    private static ArrayList<String> retPerm(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            ArrayList<String> ans1 = retPerm(s + ch + e, up.substring(1));
            ans.addAll(ans1);
        }
        return ans;
    }

    //converting the above arraylist<String> to list of list<Integer>>
    private static List<List<Integer>> convertToIntegerLists(List<String> ans) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < ans.size(); i++) {
            String str = ans.get(i);
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                temp.add(Character.getNumericValue(c));
            }


//            temp.add(Integer.parseInt(str)); //to convert String list to this
//            [[321], [231], [213], [312], [132], [123]] instead of this
//            [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]👆👆👆👆
            result.add(temp);
        }

        return result;
    }
    static int count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i);
            count = count + count(s + ch + e, up.substring(1));

        }
        return count;

    }

    //using List<List<Integer>> and only one arg
    private static List<List<Integer>> retPerm(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean [] used = new boolean [nums.length];
        permuteHelper(current, nums, used, ans);
        return ans;
    }

    private static void permuteHelper(List<Integer> current, int[] nums, boolean[] used, List<List<Integer>> ans) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                permuteHelper(current, nums, used, ans);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }


}

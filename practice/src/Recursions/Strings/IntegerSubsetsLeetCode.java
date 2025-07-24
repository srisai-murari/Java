/// subset clean explanation
package Recursions.Strings;
import java.util.*;
public class IntegerSubsetsLeetCode {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        System.out.println(subset(arr));

        System.out.println(subsetDup(arr));

        System.out.println(subsetDupK(arr));
    }

    public static List<List<Integer>> subset (int [] nums) {
        //now create a list of list that you'll be returning
        List<List<Integer>> outer = new ArrayList<>();

//        the array list can be visualized like this [
//                                                        [],[],[],[]
//                                                        [],[],[],[],
//                                                      ]
        //final output of array 1,2 could be like this [ [], [1], [2], [1,2] ]
//        initially we need to add an empty list into the list

        outer.add(new ArrayList<>()); //way of creating a new list into the list
        //now outer list is like this [[]]

        for (int num = 0; num < nums.length; num++){

            int n = outer.size();
            for(int i =0; i < n; i++){ //now run the inner loop the times of outer size
                List<Integer> inner = new ArrayList<>(outer.get(i)); //here we copy all elements present in outer i.e [[]] and run loop 1 times and add 1 to it

                inner.add(nums[num]); //here inner = [1] for first iteration where empty outer's list got a 1 added in it
                outer.add(inner); //now add that single list created in inner to outer list

            }
        }

        //or we can do this enhanced for loop

        /*
        for (int j : nums) {

            int n = outer.size();
            for (int i = 0; i < n; i++) { //now run the inner loop the times of outer size
             List<Integer> inner = new ArrayList<>(outer.get(i)); //here we copy all elements present in outer i.e [[]] and run loop 1 times and add 1 to it

                inner.add(j); //here inner = [1] for first iteration where empty outer's list got a 1 added in it
                outer.add(inner); //now add that single list created in inner to outer list

            }
        }

         */
        return outer;

        }

        /// see nothing in the below code just check the loop conditions
/*
    public static List<List<Integer>> subsetDup(int [] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++){

            //int n = outer.size();
if we use outer.size() in loop directly instead of declaring it in the above line
            for(int j = 0; j < 👉 outer.size() 👈; j++){
the loop runs forever as the outer list's size gets updated all the time

                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner); 👈👈 size increased, so loop condition will also change

                *this leads to OutOfMemoryError*
            }
        }
        return outer;
    }

*/

        public static List<List<Integer>> subsetDup (int [] nums){
            Arrays.sort(nums);
            //create a new list<list<>> that is to be returned at the end
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());

            for(int j : nums){

                int n = outer.size();

                for(int i = 0; i < n; i++){
                    List<Integer> inner = new ArrayList<>(outer.get(i));
                    inner.add(j);
                    if(!outer.contains(inner))
                        outer.add(inner);
                }
            }

            return outer;

        }

        /// ignoring duplicates with better complexity
        public static List<List<Integer>> subsetDupK(int [] nums){
            Arrays.sort(nums);

            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());

            int start = 0, end = 0;

            for(int i = 0; i < nums.length; i++){
                int n = outer.size();

                start = 0;
                if(i > 0 && nums[i - 1] == nums[i])
                    start = end + 1;
                end = n - 1;

                for(int j = start; j < n; j++){
                    List<Integer> inner = new ArrayList<>(outer.get(j));
                    inner.add(nums[i]);
                    outer.add(inner);
                }
            }
        return outer;
        }
 }

/// subset clean explanation
package Recursions.Strings;
import java.util.*;
public class IntegerSubsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subset(arr));
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
 }

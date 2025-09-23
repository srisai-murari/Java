package Aon.test;

import java.util.HashMap;

public class DeltaXPrev {
    public static void main(String[] args) {
        System.out.println(check("+915555555555"));

        int[] arr1 = {1, 2, 3, 2, 5};
        int[] arr2 = {2, 1, 5, 2, 3};

        System.out.println(areEqual(arr1, arr2)); // ✅ true

    }

    public static boolean check (String phone){
        phone = phone.replace(" ", "");

        if(phone.length() == 13 && phone.startsWith("+91")){
            for(int i = 3; i < phone.length(); i++){
                char ch = phone.charAt(i);
                if(!Character.isDigit(ch))
                    return false;
            }

            if(phone.charAt(3) >= '6' && phone.charAt(3) <= '9')
                return true;
            else return false;

        }

        else if(phone.length() == 10 || phone.length() == 11){
            boolean is11 = phone.length() == 11;
            if(is11 && phone.charAt(0) != '0')
                return false;

            for (int i = 0; i < phone.length(); i++) {
                if(!Character.isDigit(phone.charAt(i))) {
                    return false;
                }
            }

            if(is11 && phone.charAt(1) >= '6' && phone.charAt(1) <= '9'){
                return true;
            }
            else if(phone.charAt(0) >= '6' && phone.charAt(0) <= '9')
                return true;
            else return false;
        }
        return false    ;
        }
        public static boolean areEqual(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }

            // Frequency map for arr1
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int x : arr1) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            // Reduce frequency using arr2
            for (int x : arr2) {
                if (!freq.containsKey(x)) {
                    return false; // element not present
                }
                freq.put(x, freq.get(x) - 1);
            }

            // Traverse HashMap and check if all counts are zero
            for (int key : freq.keySet()) {
                if (freq.get(key) != 0) {
                    return false; // mismatch in frequency
                }
            }

            return true;
        }


    }

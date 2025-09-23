package Concepts.Huffman_coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FreqMap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = freqCount("aabcdac");


        Set<Map.Entry<Character, Integer>> en  = map.entrySet();
        System.out.println(en);

        for(Map.Entry<Character, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }


    public static HashMap<Character, Integer> freqCount (String s){
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(map);

        return map;
    }
}

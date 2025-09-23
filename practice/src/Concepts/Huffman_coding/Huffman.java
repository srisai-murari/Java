package Concepts.Huffman_coding;
import java.util.*;

public class Huffman {

    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        char data;
        int cost;
        Node left;
        Node right;

        public Node (char data, int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo (Node other){
            return this.cost - other.cost;
        }
    }

    public Huffman (String feeder) throws Exception {
        HashMap<Character, Integer> freqCount = new HashMap<>();

        for(int i = 0; i < feeder.length(); i++){
            char c = feeder.charAt(i);
            freqCount.put(c, freqCount.getOrDefault(c, 0) + 1);
        }

        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entry = freqCount.entrySet();

        for(Map.Entry<Character, Integer> e : freqCount.entrySet()){
            Node node = new Node (e.getKey(), e.getValue());
            minHeap.insert(node);
        }

        while(minHeap.size() != 1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost+second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node firstNode = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initializeEnc_Dec(firstNode, "");
    }

    private void initializeEnc_Dec (Node node, String osf){
        if(node == null)
            return;

        if(node.left == null && node.right == null){
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }

        initializeEnc_Dec(node.left, osf+"0");
        initializeEnc_Dec(node.right, osf+"1");
    }
    
    public String encoder (String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(encoder.get(s.charAt(i)));
        }

        return sb.toString();
    }

    public String decoder (String s){
        StringBuilder key = new StringBuilder();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            key.append(s.charAt(i));

            if(decoder.containsKey(key.toString())){
                char ch = decoder.get(key.toString());
                ans.append(ch);
                key.setLength(0);
            }
        }
        return ans.toString();
    }


}
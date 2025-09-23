package Concepts;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode (char ch, int freq){
        this.ch = ch;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }
}
public class HuffmanCode {

    public static HuffmanNode buildHuffmanTree (char [] chars, int [] freq){

        /// initializing priority queue
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(new Comparator <HuffmanNode>(){
            @Override
            public int compare (HuffmanNode a, HuffmanNode b){
                return a.freq - b.freq;
        }});

        /// adding elements into priority queue in huffmanNode datatype
        for(int i = 0; i < chars.length; i++)
            pq.offer(new HuffmanNode(chars[i], freq[i]));

        ///generating the tree
        while(pq.size() > 1){
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.freq + right.freq);
            parent.left = left;
            parent.right = right;

            pq.offer(parent);
        }

        return pq.poll();


    }

    public static void generateCode (HuffmanNode root, String code, HashMap<Character, String> huffmanCode){
        if(root == null) return;

        if(root.ch != '\0'){
            huffmanCode.put(root.ch, code);
            return;
        }

        generateCode(root.left, code + "0", huffmanCode);
        generateCode(root.right, code + "1", huffmanCode);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char [] chars = new char [n];
        int [] freq = new int [n];

        for(int i = 0; i < n; i++){
            chars[i] = sc.next().charAt(0);
            freq[i] = sc.nextInt();
        }

        HuffmanNode root = buildHuffmanTree(chars, freq);

        HashMap<Character, String> huffmanCode= new HashMap<>();
        generateCode(root, "", huffmanCode);


    }
}

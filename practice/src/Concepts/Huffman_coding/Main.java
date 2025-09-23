package Concepts.Huffman_coding;

public class Main {
    public static void main(String[] args) throws Exception {
        String s = "Ladkaaa";
        Huffman hf = new Huffman(s);
//
//        String encoded = hf.encoder(s);
//        System.out.println(encoded);

        String decoded = hf.decoder("0100011010100000011");
        System.out.println(decoded);
    }
}

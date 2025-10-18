package com.murari;

import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new TreeMap<>(); // TreeMap for lexicographic order
    boolean isEnd = false;
}

class Trie {
    TrieNode root = new TrieNode();

    // Insert a word into the Trie
    void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEnd = true;
    }

    // Get all words in Trie with given prefix
    List<String> getWordsWithPrefix(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) return new ArrayList<>();
            node = node.children.get(c);
        }
        List<String> results = new ArrayList<>();
        dfs(node, prefix, results);
        return results;
    }

    // DFS to collect words under a TrieNode
    void dfs(TrieNode node, String word, List<String> results) {
        if (node.isEnd) results.add(word);
        for (char c : node.children.keySet()) {
            dfs(node.children.get(c), word + c, results);
        }
    }
}

public class SearchRecommendation {
    public static void main(String[] args) {
        String[] words = {"apple", "app", "application", "banana", "bat", "ball", "cat"};
        String query = "ap";

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        String prefix = "";
        for (char c : query.toCharArray()) {
            prefix += c;
            List<String> suggestions = trie.getWordsWithPrefix(prefix);
            System.out.println("After typing '" + prefix + "' → " + suggestions);
        }
    }
}

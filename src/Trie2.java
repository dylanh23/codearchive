import java.util.HashMap;

/**
 * Created by dhare on 07/07/17.
 */
public class Trie2 {
    class Trie {
        HashMap<Character, Trie> map = new HashMap<>();
        boolean done;
//        Trie(int c) {
//        }
    }

    Trie root = new Trie();

    void insert(String word) {
        char[] chars = word.toCharArray();
        Trie start = root;
        for (int i = 0; i < chars.length; i++) {
            if (start.map.containsKey(chars[i])) {
                start = start.map.get(chars[i]);
            } else {
                Trie temp = new Trie();
                start.map.put(chars[i], temp);
                start = temp;
            }
        }
        start.done = true;
    }

    boolean search(String word) {
        return search(word, false);
    }

    boolean search(String word, boolean b) {
        char[] chars = word.toCharArray();
        Trie start = root;
        for (int i = 0; i < chars.length; i++) {
            if (start.map.containsKey(chars[i])) {
                start = start.map.get(chars[i]);
            } else {
                return false;
            }
        }
        return b || start.done;
    }

    boolean prefixTree(String word) {
        return search(word, true);
    }
}

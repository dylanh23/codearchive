import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhare on 6/1/2017.
 */
public class MapIncrement {
    void method() {
        Map<String, Integer> freq = new HashMap<String, Integer>();
        String word = "a";
        Integer count = freq.get(word);
        if (count == null) {
            freq.put(word, 1);
        }
        else {
            freq.put(word, count + 1);
        }

        int c = freq.containsKey(word) ? freq.get(word) : 0;
        freq.put(word, c + 1);

        int i = freq.getOrDefault(word, 0);
        freq.put(word, i + 1);
    }
}

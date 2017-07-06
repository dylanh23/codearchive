import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by dhare on 6/5/2017.
 */
public class listToArray {
    void method() {
        List<String> stockList = new ArrayList<String>();
        String[] stockArr = stockList.toArray(new String[stockList.size()]);
        Integer[] array = new Integer[5];
        List<Integer> list = Arrays.asList(array);
    }

    static int[] oddNumbers(int l, int r) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0)
                list.add(i);
        }
        int[] a = new Integer[list.size()];
        return list.toArray(new I{});
    }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by D on 7/4/2017.
 */
public class LoopHashMap {
   void method() {
     HashMap<Integer, String> mp = new HashMap<>();
     Iterator it = mp.entrySet().iterator();
     while (it.hasNext()) {
       Map.Entry pair = (Map.Entry)it.next();
       int i = (int) pair.getKey();
       String s = (String) pair.getValue();
       it.remove(); // avoids a ConcurrentModificationException
     }
   }
}

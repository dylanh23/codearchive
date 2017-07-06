import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by D on 5/29/2017.
 */
public class priorityQueue {
  void method() {
    String s;
    int i = s.length();
    for (; i >= 0; i--) {
        if (new StringBuilder(s.substring(i)).reverse().toString().equals(s.substring(i)))
          break;
    }

    s.toch

    PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();
    Iterator<Integer> iter = myPriorityQueue.iterator();
    while (iter.hasNext()) {
      int current = iter.next();
      // do something with current

    }
    while (myPriorityQueue.size() > 0) {
      int current = myPriorityQueue.remove();
      myPriorityQueue.peek();
    }


    //max
    PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(20, Collections.reverseOrder());
  }

}

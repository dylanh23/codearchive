import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by D on 5/29/2017.
 */
public class priorityQueue {
  void method() {
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
  }
}

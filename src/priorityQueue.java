import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by D on 5/29/2017.
 */
public class priorityQueue {
  /**
   *
   Offer() and add() methods are used to insert the element in the queue. O(log(n))
   Poll() and remove() is used to delete the element from the queue. O(log(n))
   Element retrieval methods i.e. peek() and element(), that are used to retrieve elements from the head of the queue is constant time i.e. O(1).
   contains(Object)method that is used to check if a particular element is present in the queue, have leaner time complexity i.e. O(n).
   */

  void method() {
    PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();
    /** NOT IN ORDER**/
    Iterator<Integer> iter = myPriorityQueue.iterator();
    while (iter.hasNext()) {
      int current = iter.next();
      // do something with current

    }
    while (myPriorityQueue.size() > 0) {
      int current = myPriorityQueue.remove();
      myPriorityQueue.peek();
    }
    PriorityQueue<result> results = new PriorityQueue<>(new PriorityQueue<>(11, new Comparator<result>(){
      public int compare(result a, result b){
        if (a.i > b.i) return 1;
        if (a.i == b.i) return 0;
        return -1;
      }
    }));
  }

  static class result {
    int j, k, i;
    char d;
    result(int j, int k, char d, int i) {
      this.j = j;
      this.k = k;
      this.d = d;
      this.i = i;
    }
  }
}

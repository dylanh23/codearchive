import java.awt.*;
import java.sql.Time;
import java.util.*;

/**
 * Created by D on 5/29/2017.
 */
public class CustomComparator {

  void method() {
    MyComparator comparator = new MyComparator();
    PriorityQueue<c> heap = new PriorityQueue<>(11, comparator);
    Queue<Point> heap2 = new PriorityQueue<>(11, new Comparator<Point>() {

      public int compare(Point o1, Point o2) {
        return Double.compare(o1.getX(), o2.getX());
      }
    });
  }

  class c {
    Time x;
  }

  static class MyComparator implements Comparator<c> {

    public int compare(c a, c b) {
      return a.x.compareTo(b.x);
    }
  }
}

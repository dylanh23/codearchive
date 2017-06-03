import java.awt.*;
import java.sql.Time;
import java.util.*;
import java.util.List;

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
    List<String> stringList = new ArrayList<>();
    Collections.sort(stringList, new Comparator<String>() {
    public int compare(String o1, String o2) {
      if (o1.length() > o2.length()) {
        return 1;
      } else if (o1.length() < o2.length()) {
        return -1;
      } else {
        return 0;
      }
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

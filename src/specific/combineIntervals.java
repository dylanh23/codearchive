package specific;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 sort by start and combine neighbours
 */
public class combineIntervals {

  class Interval {
    int start, end;

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();

    if (intervals == null || intervals.size() == 0)
      return result;

    Collections.sort(intervals, new Comparator<Interval>() {
      public int compare(Interval i1, Interval i2) {
        if (i1.start != i2.start)
          return i1.start - i2.start;
        else
          return i1.end - i2.end;
      }
    });

    Interval pre = intervals.get(0);
    for (int i = 0; i < intervals.size(); i++) {
      Interval curr = intervals.get(i);
      if (curr.start > pre.end) {
        result.add(pre);
        pre = curr;
      } else {
        Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
        pre = merged;
      }
    }
    result.add(pre);

    return result;
  }
}

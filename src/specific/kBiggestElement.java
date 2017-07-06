package specific;

import java.util.PriorityQueue;

/**
 unsorted array
 Time complexity is O(nlog(k)). Space complexity is O(k) for storing the top k numbers.
 */
public class kBiggestElement {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
    for(int i: nums){
      q.offer(i);

      if(q.size()>k){
        q.poll();
      }
    }

    return q.peek();
  }
}

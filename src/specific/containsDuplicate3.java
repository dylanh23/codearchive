package specific;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 keep window by removing and adding 1 each time if i >= k,
 see if there are 2 numbers that are within range [curr-t, curr+t]
 */
public class containsDuplicate3 {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    //k = index
    if(nums==null||nums.length<2||k<0||t<0)
      return false;

    TreeSet<Long> set = new TreeSet<Long>();
    for(int i=0; i<nums.length; i++){
      long curr = (long) nums[i];

      long leftBoundary = (long) curr-t;
      long rightBoundary = (long) curr+t+1; //right boundary is exclusive, so +1
      SortedSet<Long> sub = set.subSet(leftBoundary, rightBoundary);
      if(sub.size()>0)
        return true;

      set.add(curr);

      if(i>=k){ // or if(set.size()>=k+1)
        set.remove((long)nums[i-k]);
      }
    }

    return false;
  }

  public static void main(String[] args) {
    containsDuplicate3 containsDuplicate3 = new containsDuplicate3();
    int[] nums = {10,3,20,25, 12, 6};
    containsDuplicate3.containsNearbyAlmostDuplicate(nums, 4, 3);
  }
}

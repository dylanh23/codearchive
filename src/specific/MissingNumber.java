package specific;

import java.util.Arrays;

/**
 * Created by D on 7/6/2017.
 */
public class MissingNumber {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int l=0, r=nums.length;
    while(l<r){
      int m = (l+r)/2;
      if(nums[m]>m){
        r=m;
      }else{
        l=m+1;
      }
    }

    return r;
  }
}

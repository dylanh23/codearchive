package specific;

/**
 * Created by dhare on 07/07/17.
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;

        int[] max = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            max[i]=1;
            for(int j=0; j<i;j++){
                if(nums[i]>nums[j]){
                    max[i]=Math.max(max[i], max[j]+1);
                }
            }
        }

        int result = 0;
        for(int i=0; i<max.length; i++){
            if(max[i]>result)
                result = max[i];
        }
        return result;
    }

    int[] a;

    int recursive(int biggest, int i) {
        int ans = 0;
        if (a[i] > biggest) {
            ans = recursive(a[i], i + 1) + 1;
        }
        return Math.max(ans, recursive(biggest, i + 1));
    }
}

/**
 * Created by dhare on 6/1/2017.
 */
public class AlphabetToChar {
    void method() {
        int temp = (int) 'A';
        int lowercase = temp - 96;
        int uppercase = temp - 64;
        HashMap<Integer, Integer> map = new HashMap<>();
        public int[] twoSum(int[] nums, int target) {
            int[] a = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) != null)) {
                    a[0] = map.get(nums[i]);
                    a[1] = nums[i];
                    break;
                } else {
                    map.put(target - nums[i], i);
                }
            }
            return a;
        }
    }
}

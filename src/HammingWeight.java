/**
 * Created by D on 6/12/2017.
 */
public class HammingWeight {
  static int hammingWeight(int n) {
    int ans = 0;
    while (n != 0) {
      ans++;
      n &= (n - 1);
    }
    Integer.parseInt("11111111111111111111111111111111", 2);
    return ans;
  }

  public static void main(String[] args) {
    hammingWeight(-2147483648);
  }
}

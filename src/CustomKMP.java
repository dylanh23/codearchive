/**
 * Created by D on 7/3/2017.
 */
public class CustomKMP {
  int[] lps;
  String pattern;

  //longest proper prefix which is also suffix

//  CustomKMP(String pattern) {
//    this.pattern = pattern;
//    common = new int[pattern.length()];
//    for (int i = 0; i < common.length; i++) {
//      int j = 0;
//      int k = i;
//      int count = 0;
//      while (j < k) {
//        if (pattern.charAt(j) == pattern.charAt(k)) {
//          count++;
//          j++;
//          k--;
//        } else {
//          break;
//        }
//      }
//      common[i] = count;
//    }
//  }

  void computeLPSArray(String pat) {
    this.pattern = pat;
    // length of the previous longest prefix suffix
    int len = 0;
    int i = 1;
    lps = new int[pat.length()];
    lps[0] = 0;  // lps[0] is always 0

    // the loop calculates lps[i] for i = 1 to M-1
    while (i < pat.length()) {
      if (pat.charAt(i) == pat.charAt(len)) {
        len++;
        lps[i] = len;
        i++;
      } else  // (pat[i] != pat[len])
      {
        // This is tricky. Consider the example.
        // AAACAAAA and i = 7. The idea is similar
        // to search step.
        if (len != 0) {
          len = lps[len - 1];

          // Also, note that we do not increment
          // i here
        } else  // if (len == 0)
        {
          lps[i] = len;
          i++;
        }
      }
    }
  }

  int search(String s) {
    int j = 0;
    for (int i = 0; i < s.length();) {
      if (pattern.charAt(j) == s.charAt(i)) {
        j++;
        if (j == pattern.length())
          return i;
        i++;
      } else {
        if (j == 0)
          i++;
        else
          j = lps[j - 1];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    CustomKMP kmp = new CustomKMP();
    kmp.computeLPSArray("AABAACAABAA");
    kmp.search("AABACAABACAABAACAABAA");

  }
}

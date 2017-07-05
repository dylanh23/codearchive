/**
 * Created by D on 7/3/2017.
 */
public class KMP {
  private final int R;       // the radix
  private int[][] dfa;       // the KMP automoton

  private char[] pattern;    // either the character array for the pattern
  private String pat;        // or the pattern string

  /**
   * Preprocesses the pattern string.
   *
   * @param pat the pattern string
   */
  public KMP(String pat) {
    this.R = 256;
    this.pat = pat;

    // build DFA from pattern
    int m = pat.length();
    dfa = new int[R][m];
    dfa[pat.charAt(0)][0] = 1;
    for (int x = 0, j = 1; j < m; j++) {
      for (int c = 0; c < R; c++)
        dfa[c][j] = dfa[c][x];     // Copy mismatch cases.
      dfa[pat.charAt(j)][j] = j+1;   // Set match case.
      x = dfa[pat.charAt(j)][x];     // Update restart state.
    }
  }
  /**
   * Returns the index of the first occurrrence of the pattern string
   * in the text string.
   *
   * @param  txt the text string
   * @return the index of the first occurrence of the pattern string
   *         in the text string; N if no such match
   */
  public int search(String txt) {

    // simulate operation of DFA on text
    int m = pat.length();
    int n = txt.length();
    int i, j;
    for (i = 0, j = 0; i < n && j < m; i++) {
      j = dfa[txt.charAt(i)][j];
    }
    if (j == m) return i - m;    // found
    return -1;                    // not found
  }

  public static void main(String[] args) {
    KMP kmp = new KMP("saaad");
    kmp.search("agdasadsgaasaaaddf");
  }
}

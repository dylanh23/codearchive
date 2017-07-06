/**
 * Created by dhare on 6/6/2017.
 */
public class HashString {
     void method() {
          String s = "afdadf";
         if (getHash("afdadfadfs") == getHash(s) + Math.pow(2, s.length()) * getHash("adfs"))
              System.out.println();
     }

     int getHash(String s) {
          char[] chars = s.toCharArray();
          int hash = 0;
          for (int i = 0; i < chars.length; i++) {
               hash += Math.pow(2, i) * (chars[i] - 96);
          }
          return hash;
     }
}

package specific;

/**
 * Created by D on 7/5/2017.
 */
public class isPalindrome {
  public static boolean isValidPalindrome(String s){
    if(s==null||s.length()==0) return false;

    //removes all characters that arent alphabet, to lower case
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    System.out.println(s);

    for(int i = 0; i < s.length() ; i++){
      if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
        return false;
      }
    }

    return true;
  }
}

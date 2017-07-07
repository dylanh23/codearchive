/**
 * Created by dhare on 6/1/2017.
 */
public class AlphabetToChar {
    void method() {
        int temp = (int) 'A';
        char c = 'a';
        String s = "";
        int ans;
        if (temp > 96) {
            ans = temp - 96;
        } else {
            ans = temp - 64;
        }
        //array
        if (temp > 96) {
            ans = temp - 97;
        } else {
            ans = temp - 39; //64 - 26;
        }
    }
}

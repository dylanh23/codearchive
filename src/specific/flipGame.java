package specific;

/**
 gurantees win if the other person cant win with any move
 O(n^n), O(n) recursion and n of them
 */
public class flipGame {
  public boolean canWin(String s) {
    if(s==null||s.length()==0){
      return false;
    }

    return canWinHelper(s.toCharArray());
  }

  public boolean canWinHelper(char[] arr){
    for(int i=0; i<arr.length-1;i++){
      if(arr[i]=='+'&&arr[i+1]=='+'){
        arr[i]='-';
        arr[i+1]='-';

        boolean win = canWinHelper(arr);

        arr[i]='+';
        arr[i+1]='+';

        //if there is a flip which makes the other player lose, the first play wins
        if(!win){
          return true;
        }
      }
    }

    return false;
  }
}

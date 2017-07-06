package specific;

/**
 * Created by D on 7/5/2017.
 */
public class removeElement {
  public int removeElement(int[] A, int elem) {
    int i=0;
    int j=0;

    while(j < A.length){
      if(A[j] != elem){
        A[i] = A[j];
        i++;
      }

      j++;
    }

    return i;
  }
}

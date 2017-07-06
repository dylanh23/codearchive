package specific;

/**
 * Created by D on 7/5/2017.
 */
public class mergeTwoArrays {
  public void merge(int A[], int m, int B[], int n) {

    while(m > 0 && n > 0){
      if(A[m-1] > B[n-1]){
        A[m+n-1] = A[m-1];
        m--;
      }else{
        A[m+n-1] = B[n-1];
        n--;
      }
    }

    while(n > 0){
      A[m+n-1] = B[n-1];
      n--;
    }
  }
}

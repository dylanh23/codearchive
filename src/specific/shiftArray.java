package specific;

/**
 new array O(n), O(n)
 bubble rotate O(kn), O(n)
 reversal O(1) O(n)
 */
public class shiftArray {
  public static void rotate(int[] arr, int order) {
    if (arr == null || arr.length==0 || order < 0) {
      throw new IllegalArgumentException("Illegal argument!");
    }

    if(order > arr.length){
      order = order %arr.length;
    }

    //length of first part
    int a = arr.length - order;

    reverse(arr, 0, a-1);
    reverse(arr, a, arr.length-1);
    reverse(arr, 0, arr.length-1);

  }

  public static void reverse(int[] arr, int left, int right){
    if(arr == null || arr.length == 1)
      return;

    while(left < right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}

import java.util.ArrayList;

public class Sorting {

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 7, 8, 1, 4, 10, 8};
        mergeSort(a, 0, a.length - 1);
        System.out.println();
    }

    //not stable sort O(N log N) average, O(N^2) worst, O(log N) storage
    static void sortSegment(int[] a, int begin, int end) {
        if (begin >= end)
            return;
        int val = a[end];
        int j = begin;
        for (int  i = begin; i < end; i++) {
            if (a[i] <= val) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        int temp = a[j];
        a[j] = a[end];
        a[end] = temp;
        sortSegment(a, j + 1, end);
        sortSegment(a, begin, j - 1);
    }

    public void sortColors(int[] nums) {
        if(nums==null||nums.length<2){
            return;
        }

        int[] countArray = new int[3];
        for(int i=0; i<nums.length; i++){
            countArray[nums[i]]++;
        }

        for(int i=1; i<=2; i++){
            countArray[i]=countArray[i-1]+countArray[i];
        }

        int[] sorted = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            int index = countArray[nums[i]]-1;
            countArray[nums[i]] = countArray[nums[i]]-1;
            sorted[index]=nums[i];
        }

        System.arraycopy(sorted, 0, nums, 0, nums.length);
    }

    //stable, O(N log N) O(N) space
    static ArrayList<Integer> mergeSort(int[] arr, int start, int end) {
        ArrayList<Integer> result = new ArrayList<>();
        if (start > end) {
            return null;
        } else if (start == end) {
            result.add(arr[start]);
            return result;
        }
        int i = 0;
        int j = 0;
        ArrayList<Integer> a = mergeSort(arr, start, start + (end - start) / 2);
        ArrayList<Integer> b = mergeSort(arr, start + (end - start) / 2 + 1, end);
        while (j != b.size() || i != a.size()) {
            if (i == a.size()) {
                result.add(b.get(j));
                j++;
            } else if (j == b.size()) {
                result.add(a.get(i));
                i++;
            } else if (a.get(i) > b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }
        return result;
    }
}
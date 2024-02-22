import java.util.Arrays;

/**
 * SELECTION_SORT
 */
/* Selection sort is a simple and efficient sorting algorithm that works by repeatedly
selecting the smallest (or largest) element from the unsorted protion of the list
*/
public class SELECTION_SORT {

    public static void main(String[] args) {
        int[] arr = {5,6,1,7,2,8};
        int start = 0;
        int end = arr.length-1;
        
        
        while (start < end) {
            int smallest = Integer.MAX_VALUE;
            int smallestIndex = 0;
            for(int i = start; i < end; i++) {
                if(arr[i]<smallest){
                    smallest = arr[i];
                    smallestIndex = i;
                }
            }
            swap(arr,start,smallestIndex);
            start++;
            
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
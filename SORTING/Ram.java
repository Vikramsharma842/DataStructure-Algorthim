import java.util.Arrays;

public class Ram {
    
    public static void main(String[] args) {
        int[] arr= {1,4,5,6};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

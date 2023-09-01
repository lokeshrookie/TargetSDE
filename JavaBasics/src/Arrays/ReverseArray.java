package Arrays;


import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        int mid = arr.length/2;
        while(first < mid){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

    }
}

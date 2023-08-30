package SearchigAndSorting;

import java.util.Arrays;

/**
 * Bubble sort:
 *      Compare neighbouring elements and swap if present is not smaller than next one.
 *      For evey inner iteration, the largest element will come to the end of the array
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) { // outer loop iterates all over the elements.
            for (int j = 0; j < arr.length-i-1; j++) { // the outer loop re-compares the elements and swaps if necessary.
//                System.out.println(Arrays.toString(arr) + " i = " + i + " j = " + j ); // to check only
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

//    public static  int[] bubbleSort2(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr.length-1; j++) {
//                if(arr[j] >  arr[j+1]){
//                    swap(arr, j, j+1);
//                }
//            }
//        }
//        return arr;
//    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

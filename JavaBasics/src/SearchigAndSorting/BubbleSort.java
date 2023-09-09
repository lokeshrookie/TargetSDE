package SearchigAndSorting;

import java.util.Arrays;

/**
 * Bubble sort:
 *      Compare neighbouring elements and swap if present is not smaller than next one.
 *      For evey inner iteration, the largest element will come to the end of the array
 *
 *
 1. we need to compare current element with next element and swap if it is larger
 2. outer-loop iterates over all the indexes.
 3. inner-loop iterates till arr.length-1.
 4. we can optimise this by iterating till arr.length-1-i. becasue,
 the arr.length-i element is already in its correct position. (i elements on the left are already sorted).
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

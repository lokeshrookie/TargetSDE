package SearchigAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

import static SearchigAndSorting.BubbleSort.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length-1)));

    }

    // find pivot,
    // move all elements less than pivot to left,
    // move all elements greater than pivot to right.
    // lets take pivot as end element.
    private static void quickSort(int[] arr, int start , int end ) {
        if(start >= end) return;
        int pivot = quick2(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end );
    }

    public static int quick2(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for (int j = start; j <= end-1; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
     return  i;
    }

//    public static int quick(int[] arr, int start, int end){
//        int pivot = arr[end];
//        int i = start-1;
//        for (int j = start; j <= end - 1; j++) {
//            if(arr[j] < pivot){
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        i++;
//        int temp = arr[i];
//        arr[i] = arr[end];
//        arr[end] = temp;
//
//        return i;
//    }

//    private static int partition(int[] arr, int start, int end) {
//        int pivot = arr[end]; // lets say end element is pivot element.
//        int i = start-1;  // i pointer starts before start , (if start is 0, i will be -1).
//        for (int j = 1; j <end-1; j++) { // j pointer starts after i.
//            if(arr[j] < pivot){ // if the element at j pointer is less than pivot, then increment i and swap elements at j and i,
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        } // then all elements less than pivot will be at left and greater than pivot will be at right.
//        // now, increment the i and put the pivot into its place.
//        i++;
//        int temp = arr[i];
//        arr[i] = arr[end];
//        arr[end] = temp;
//        return i;
//    }
}

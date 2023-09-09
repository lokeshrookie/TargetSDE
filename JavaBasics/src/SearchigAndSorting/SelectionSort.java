package SearchigAndSorting;

import java.util.Arrays;

/**
 * Selection sort: sort the array by selecting the max element and putting in on the last index.
 * (or) selecting the min element and put it on the first index.
 *
 * Algorithm:
 * 1. Iterate through array and in every iteration, find the maxIndex and last Index.
 * 2. swap element between maxIndex and last index.
 * 3. Formula for the finding the last index is (last = arr.length-1-i).
 *      means: the last index in arr.length-1, but during the i'th iteration,
 *      already i number of elements are sorted from the right side of the array.
 *      so subtract the i value from the last index to get the last index of that iteration.
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int lastIndex = arr.length-i-1;
            int maxIndex = findMax(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
        return  arr;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // find the index with maximum element.
    public static int findMax(int[] arr, int first, int last){
        int maxIndex = first;
        for (int i = first; i <=last; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

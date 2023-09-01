package SearchigAndSorting;

import java.util.Arrays;

/**
 * Insertion sort: Sorting array liked arranging playing cards.
 *
 * Working :
 * arr = 5 4 3 2 1
 *  i = 0, j = i+1 = 1 , res: 4, 5
 *   i = 1, j = i+1 = 2 res = 3 4 5 ( 3 will be compared with the remaining elements in the array).
 * summary: for every iteration of i, elements up-to i+1 will be sorted.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(arr, i,  j);
                }
            }
        }
        return  arr;
    }

    public static void  swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}



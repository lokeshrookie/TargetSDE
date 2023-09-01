package SearchigAndSorting;

import java.util.Arrays;

/**
 * MergeSort : dividing the array into two parts and merging them after sorting individually.
 *
 * Algorithm :
 * using recursion.
 * 1 . one method for recursively sorting and another for merging both of them after sorting.hkjk
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        // input is an aray. we have to divide the array into two parts sort them by recursion.
        if(arr.length <=1) return arr;
        int mid = arr.length/2;
        /// 1 2 3 4 5
        /// 0 1 2 3 4
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }
    public static int[] merge(int[] left, int[] right){
        // input is two arrays. we need to merge tham here.
        int[] mix = new int[left.length + right.length];
        int l = 0 ;
        int r = 0;
        int m = 0;
        while(l < left.length && r < right.length ){ // we should not use m< mix.length, because we need to consider these two arrays.
            if(left[l] < right[r]){
                mix[m] = left[l];
                l++;
                m++;
            }
            if(right[r] < left[l]){
                mix[m] = right[r];
                r++;
                m++;
            }
        }
        while(l < left.length){
            mix[m] = left[l];
            m++;
            l++;
        }
        while(r < right.length){
            mix[m] = right[r];
            m++;
            r++;
        }
        return  mix;
    }
}



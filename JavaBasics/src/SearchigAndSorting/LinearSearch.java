package SearchigAndSorting;

/**
 * Linear Search:
 * If the target found in the given array, then index of target element will be returned.
 *
 */
public class LinearSearch {
    public static void main(String[] args) {

    }

    public static  int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }
}

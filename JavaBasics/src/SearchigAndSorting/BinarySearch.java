package SearchigAndSorting;

/**
 * Binary Search:
 *      1. used to search an element of an array in O(lon n) time
 *      2. This will work only on sorted arrays.
 * Algorithm:
 * 1. Find the middle index.
 * 2. Compare target with the middle element. Since the array is sorted,
 *      based on the comparison, we can decide which half of the array to search.
 * 3. If the middle element is target, then return that index.
 * 4. If the target is larger than the middle element, then search only second half of the array.
 *      if not, then first half until the size of the array reaches 1.
 * 5. If not found, -1 will be returned.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,};
        int target = 1;
        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return  -1;
    }
}

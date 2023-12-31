package Arrays;

/**
 * Initialization: Start with two variables, maxSum and currentSum, both set to the value of the first element in the array.
 *
 * Iterate and Update: Go through the array element by element. At each step, update currentSum by adding the current element.
 * If currentSum becomes negative, reset it to zero. Continuously update maxSum with the maximum value between itself and currentSum.
 * This step efficiently finds the maximum subarray sum.
 *
 * Result: Once you've processed all elements, the maxSum variable will contain the maximum subarray sum.
 * The algorithm is efficient with a time complexity of O(n), making it a popular choice for solving maximum subarray sum problems.
 */
public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr = { 1,2 -3, 4, -3,-6, -8, 0, 5, 6, -9, -7, -9};
        System.out.println(maxSubArraySum(arr));
    }

    //bruteforce
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to negative infinity

        // Iterate through all possible subarrays
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                // Compute the sum of the current subarray
                currentSum += nums[j];

                // Update maxSum if the current subarray sum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum; // maxSum contains the maximum subarray sum
    }


    // optimised.
    public static int maxSubArraySum(int[] arr){
        int current_max = arr[0];
        int max = arr[0];
        for (int j : arr) {
            current_max = current_max + j;
            if (current_max < 0) {
                current_max = 0;
            } else if (current_max > max) {
                max = current_max;
            }
        }
        return max;
    }
}

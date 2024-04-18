package arrays.prefixsum;

public class MaxSumCornerElem {
public static void main(String[] args) {
	int[] arr = { 8, 4, 4, 8, 12, 3, 2, 9 };
    int K = 3;
    int n = arr.length;
    System.out.print(maxPointCount(arr, K, n));
}

// Function to return maximum sum
public static int maxPointCount(int arr[], int K, int size)
{
    int window_sum = 0;
    int max_sum = 0;
    for (int i = 0; i < K; i++)
        window_sum += arr[i];
    // Update value for max_sum
    max_sum = window_sum;
    int j = size - 1;
    for (int i = K - 1; i >= 0; i--) {
        window_sum = window_sum + arr[j] - arr[i];
        max_sum = Math.max(window_sum, max_sum);
        j--;
    }
    // Return the final result
    return max_sum;
}
}

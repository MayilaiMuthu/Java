package geeks160problem;

/*Maximum Product Subarray
Difficulty: MediumAccuracy: 18.09%Submissions: 433K+Points: 4
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30.
Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. */

public class MaximumProductSubArray {

	static int maxProduct(int[] arr) {
		int maxValue = arr[0];
		int minValue = arr[0];
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int temp = maxValue;
			maxValue = Math.max(arr[i], Math.max((temp * arr[i]), (minValue * arr[i])));
			minValue = Math.min(arr[i], Math.min((temp * arr[i]), (minValue * arr[i])));
			result = Math.max(result, maxValue);
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { -1, -3, -10, 0, 6 };
		System.out.println(maxProduct(arr));
		int arr1[] = { 2, 3, 4 };
		System.out.println(maxProduct(arr1));
	}

}

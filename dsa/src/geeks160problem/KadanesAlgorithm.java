package geeks160problem;

/*Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 1.1MPoints: 4Average Time: 20m
Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray {-2} has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.*/

public class KadanesAlgorithm {

	public static void main(String[] args) {
		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.print(maxSubarraySum(arr));
	}

	static int maxSubarraySum(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			k = arr[i] + k;
			// System.out.println(k);
			maxValue = Math.max(maxValue, k);
			// System.out.println(maxValue);
			if (k < 0)
				k = 0;
		}
		return maxValue;
	}

}

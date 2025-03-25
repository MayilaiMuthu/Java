package geeks160problem;

/*Max Circular Subarray Sum
Difficulty: HardAccuracy: 29.37%Submissions: 146K+Points: 8Average Time: 25m
Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

Examples:

Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
Input: arr[] = [-1, 40, -14, 7, 6, 5, -4, -1] 
Output: 52
Explanation: Circular Subarray [7, 6, 5, -4, -1, -1, 40] has the maximum sum, which is 52.*/

public class MaxCircularSubArrayy {

	static int circularSubarraySum(int arr[]) {
		int minCurrentSum = arr[0], maxCurrentSum = arr[0], minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE,
				total = arr[0];
		for (int i = 1; i < arr.length; i++) {
			minCurrentSum = Math.min(minCurrentSum + arr[i], arr[i]);
			minValue = Math.min(minCurrentSum, minValue);
			maxCurrentSum = Math.max(maxCurrentSum + arr[i], arr[i]);
			maxValue = Math.max(maxCurrentSum, maxValue);
			total += arr[i];
		}
		if (total == minValue) {
			return maxValue;
		} else {
			return Math.max(maxValue, total - minValue);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, -3, -4, 7, 6, 5, -4, -1 };
		System.out.println(circularSubarraySum(arr));
		int arr1[] = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(circularSubarraySum(arr1));
	}

}

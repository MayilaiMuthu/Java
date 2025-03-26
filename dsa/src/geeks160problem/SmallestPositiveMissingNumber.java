package geeks160problem;

/*Smallest Positive Missing
Difficulty: MediumAccuracy: 25.13%Submissions: 401K+Points: 4
You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: Smallest positive missing number is 4.
Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: Smallest positive missing number is 1.*/

public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
		int arr1[] = { 2, -3, 4, 1, 1, 7 };
		System.out.println(missingNumber(arr1));
		int arr2[] = { 5, 3, 2, 5, 1 };
		System.out.println(missingNumber(arr2));
		int arr3[] = { -8, 0, -1, -4, -3 };
		System.out.println(missingNumber(arr3));
	}

	private static int missingNumber(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			while (arr[i] > 0 && arr[i] < n + 1 && arr[i] != arr[arr[i] - 1])
				swap(arr, i, arr[i] - 1);
		for (int i = 0; i < n; i++)
			if (arr[i] != i + 1)
				return i + 1;
		return n + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

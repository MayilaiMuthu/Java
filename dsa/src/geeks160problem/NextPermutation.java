package geeks160problem;

/*Next Permutation
Difficulty: MediumAccuracy: 40.66%Submissions: 189K+Points: 4Average Time: 20m
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.*/

public class NextPermutation {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 2, 1, 0 };
		nextPermutation(arr);
		System.out.println("Order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	static void nextPermutation(int[] arr) {
		int i = arr.length - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}
		// System.out.print(i);
		if (i >= 0) {
			int j = arr.length - 1;
			while (j >= 0 && arr[j] <= arr[i])
				j--;
			swap(arr, i, j);
		}
		reverse(arr, i + 1);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverse(int[] arr, int start) {
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			;
			end--;
		}
	}
}

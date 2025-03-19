package geeks160problem;

/*Reverse an Array
Difficulty: EasyAccuracy: 55.32%Submissions: 143K+Points: 2Average Time: 5m
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.*/

public class ReverseArray {
	public static void reverseArray(int arr[]) {
		int length = arr.length;
		if (length < 2) {
			return;
		}
		int mid = length / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 6, 5 };
		reverseArray(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
	}
}

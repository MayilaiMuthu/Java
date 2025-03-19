package geeks160problem;

/*Move All Zeroes to End
Difficulty: EasyAccuracy: 45.51%Submissions: 287K+Points: 2Average Time: 15m
You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.*/
public class MoveAllZeroes {
	static void pushZerosToEnd(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0) {
				temp++;
			}
			if (arr[i] == 0 && arr[i + 1] != 0) {
				arr[temp] = arr[i + 1];
				/// System.out.println(arr[temp]);
				arr[i + 1] = 0;
				temp++;
			}

			// System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		pushZerosToEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}

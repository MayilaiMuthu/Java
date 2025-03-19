package geeks160problem;

/*Rotate Array
Difficulty: MediumAccuracy: 37.06%Submissions: 458K+Points: 4Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
*/
public class RotateArrayByyNthElement {
	
	static void rotateArr(int arr[], int d) {
        int length = arr.length;
        if(length<2 || d%length == 0){
            return;
        }
        if(d>length){
            d=d%length;
        }
        //System.out.println(d);
        int[] temp = new int[length];
        for(int i=0; i<length; i++){
            temp[i] = arr[i];
        }
        int count = 0;
        for(int i=d; i<length; i++){
            arr[count] = temp[i];
            count++;
        }
        //System.out.println(count);
        for(int i=0; i<d; i++){
            arr[count] = temp[i];
            count++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 5, 3, 4, 2};
        rotateArr(arr, 7);
        for(int i=0; i<arr.length; i++){
        	System.out.print(arr[i]);
        }
    }

}

package geeks160problem;

/*Second Largest
Difficulty: EasyAccuracy: 26.72%Submissions: 1.1MPoints: 2Average Time: 15m
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.*/

public class SecondLargestElement {
	
	    public static int getSecondLargest(int[] arr) {
	        if(arr.length<2){
	            return -1;
	        }
	        int a = arr[0];
	        int b = -1;
	        for(int i=0; i<arr.length; i++){
	           if(arr[i]>a){
	               b=a;
	               a = arr[i];
	           }
	           if(arr[i]>b && a!= arr[i]){
	               b=arr[i];
	           }
	        }
	        return b;
	    }
	    public static void main(String[] args) {
	        int arr[] = {17296, 9524, 28446, 12750, 422, 7888, 25584};
	        System.out.println(getSecondLargest(arr));
	    }
	}

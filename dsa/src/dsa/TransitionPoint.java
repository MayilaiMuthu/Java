package dsa;

public class TransitionPoint {

	private static int findTransitionPoint(int[] args) {
		if (args.length == 0)
			return -1;
		int start = 0;
		int end = args.length - 1;
		int flag = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid > 0 && args[mid - 1] == 0 && args[mid] == 1) {
				return mid;
			} else if (args[mid] == 0) {
				start = mid + 1;
			} else {
				flag = 1;
				end = mid - 1;
			}
		}
		if (flag == 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(
				"Given a sorted array containing only numbers 0 and 1, the task is to find the transition point efficiently.");
		System.out.println("The transition point is the point where “0” ends and “1” begins.");
		int[] a = { 0, 0, 0, 1, 1, 1 }; // Transition point is at index 3
		int[] b = { 0, 0, 1, 1, 1 }; // Transition point is at index 2
		int[] c = { 0, 1, 1, 1, 1 }; // Transition point is at index 1
		int[] d = { 0, 0, 0, 0, 0 }; // No transition point, since there are no 1's
		int[] e = { 1, 1, 1, 1, 1 }; // Transition point is at index 0 (first element is 1)
		int[] f = { 0 }; // No transition point, just one element
		System.out.println("a -> Result: " + findTransitionPoint(a));
		System.out.println("b -> Result: " + findTransitionPoint(b));
		System.out.println("c -> Result: " + findTransitionPoint(c));
		System.out.println("d -> Result: " + findTransitionPoint(d));
		System.out.println("e -> Result: " + findTransitionPoint(e));
		System.out.println("f -> Result: " + findTransitionPoint(f));
	}

}

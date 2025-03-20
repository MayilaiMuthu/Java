package geeks160problem;

import java.util.ArrayList;
import java.util.List;

public class MajorityVote {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
		System.out.println(findMajority(arr));
	}

	static List<Integer> findMajority(int[] nums) {
		List<Integer> a = new ArrayList<>();
		int c1 = 0, c2 = 0, count1 = 0, count2 = 0;
		int n = nums.length / 3;
		for (int num : nums) {
			if (c1 == num) {
				count1++;
			} else if (c2 == num) {
				count2++;
			} else if (count1 == 0) {
				c1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				c2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (c1 == num) {
				count1++;
			} else if (c2 == num) {
				count2++;
			}
		}
		if (c1 > c2) {
			if (count2 > n) {
				a.add(c2);
			}
			if (count1 > n) {
				a.add(c1);
			}
		} else {
			if (count1 > n) {
				a.add(c1);
			}
			if (count2 > n) {
				a.add(c2);
			}
		}
		return a;
	}

}

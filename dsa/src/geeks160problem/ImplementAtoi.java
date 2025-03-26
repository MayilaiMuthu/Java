package geeks160problem;

/*Implement Atoi
Difficulty: MediumAccuracy: 32.58%Submissions: 255K+Points: 4Average Time: 15m
Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
Examples:

Input: s = "-123"
Output: -123
Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
Input: s = "  -"
Output: 0
Explanation: No digits are present, therefore the returned answer is 0.
Input: s = " 1231231231311133"
Output: 2147483647
Explanation: The converted number will be greater than 231 – 1, therefore print 231 – 1 = 2147483647.
Input: s = "-999999999999"
Output: -2147483648
Explanation: The converted number is smaller than -231, therefore print -231 = -2147483648.
Input: s = "  -0012gfg4"
Output: -12
Explanation: Nothing is read after -12 as a non-digit character ‘g’ was encountered.*/

public class ImplementAtoi {

	private static int myAtoi(String s) {
		String k = s.replace(" ", "");
		String[] a = k.split("");
		if (a.length == 0 || k.equals("-")) {
			return 0;
		}
		boolean flag = false;
		if (a[0].equals("-")) {
			flag = true;
		}
		int sValue = 0;
		if (flag) {
			sValue = 1;
		}
		long ans = 0;
		for (int i = sValue; i < a.length; i++) {
			// System.out.println(Integer.parseInt(a[i])<=9);
			if (a[i].charAt(0) >= '0' && a[i].charAt(0) <= '9') {
				ans = ans * 10 + Integer.parseInt(a[i]);
				// System.out.println(ans);
			} else {
				break;
			}
		}
		if (flag && ans > Integer.MAX_VALUE) {
			return Integer.MIN_VALUE;
		} else if (flag && ans < Integer.MAX_VALUE) {
			return (int) -ans;
		} else {
			if (ans > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else
				return (int) ans;
		}
	}

	public static void main(String[] args) {
		String s = "-123";
		System.out.println(myAtoi(s));
		s = "  -";
		System.out.println(myAtoi(s));
		s = " 1231231231311133";
		System.out.println(myAtoi(s));
		s = "-999999999999";
		System.out.println(myAtoi(s));
		s = "  -0012gfg4";
		System.out.println(myAtoi(s));
	}

}

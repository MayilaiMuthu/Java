package geeks160problem;

/*Add Binary Strings
Difficulty: MediumAccuracy: 23.25%Submissions: 94K+Points: 4
Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation: 
  100
+  10
  110*/

public class AddBinaryStrings {

	public static void main(String[] args) {
		String s1 = "1101", s2 = "111";
		System.out.println(addBinary(s1, s2));
		s1 = "00100";
		s2 = "010";
		System.out.println(addBinary(s1, s2));
	}

	private static String addBinary(String s1, String s2) {
		java.math.BigInteger a = new java.math.BigInteger(s1, 2);
		java.math.BigInteger b = new java.math.BigInteger(s2, 2);
		java.math.BigInteger c = a.add(b);
		return c.toString(2);
		// return Integer.toBinaryString(Integer.parseInt(s1, 2)+Integer.parseInt(s2,
		// 2));
	}

}

package geeks160problem;

/*Non Repeating Character
Difficulty: EasyAccuracy: 40.43%Submissions: 277K+Points: 2Average Time: 30m
Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: -1
Explanation: All the characters in the given string are repeating.*/

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(nonRepeatingChar("aabbccc"));
	}

	private static char nonRepeatingChar(String s) {
		int length = s.length();
		for (int i = 0; i < length; i++) {
			boolean unique = true;
			for (int j = 0; j < length; j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				return s.charAt(i);
			}
		}
		return '$';
	}

}

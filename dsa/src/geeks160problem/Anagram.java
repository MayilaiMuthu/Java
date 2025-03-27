package geeks160problem;

import java.util.Arrays;

/*Anagram
Difficulty: EasyAccuracy: 44.93%Submissions: 387K+Points: 2Average Time: 20m
Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergic"
Output: false
Explanation: Characters in both the strings are not same, so they are not anagrams.
Input: s1 = "g", s2 = "g"
Output: true
Explanation: Character in both the strings are same, so they are anagrams.*/

public class Anagram {

	public static void main(String[] args) {
		String s1 = "g", s2 = "g";
		System.out.println(areAnagrams(s1, s2));
		s1 = "allergy";
		s2 = "allergic";
		System.out.println(areAnagrams(s1, s2));
		s1 = "geeks";
		s2 = "kseeg";
		System.out.println(areAnagrams(s1, s2));
	}

	private static boolean areAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s1.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
}

package Training;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment5_Anagrams {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status = true;
		System.out.println("Enter Input String #1:");
		String str1 = scan.next().toLowerCase();
		System.out.println("Enter Input String #2:");
		String str2 = scan.next().toLowerCase();
		scan.close();

		status = isAnagram(str1.trim(), str2.trim());
		if (status) {
			System.out.println(str1 + " and " + str2 + " is Anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagrams");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		boolean status = true;

		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		return status;
	}
}

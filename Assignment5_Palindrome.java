package Training;

import java.util.Scanner;

public class Assignment5_Palindrome {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		int len;
		System.out.println("Enter the String");
		str = scan.next().toLowerCase();
		len = str.length()-1;
		int i = 0;
		boolean flag = true;
		while (i < len && flag == true) {
			if (str.charAt(i) != str.charAt(len)) {
				flag = false;
			}
			i++;
			len--;
		}

		if (flag == true)
			System.out.println("The string '"+str +"' is Palindrome");
		else
			System.out.println("The string '"+str +"' is not Palindrome");

	}

}

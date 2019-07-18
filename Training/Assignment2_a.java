package Training;

import java.util.Scanner;
public class Assignment2_a {
	
	public static Scanner scan= new Scanner(System.in);
public static void main(String[] args)
{
	
	int value=0;
	int index=1;
	int linenumber=0;
	System.out.println("Enter any number from 1 to 100");
	value=scan.nextInt();
	System.out.println();
	
	do {
		linenumber++;
		for(int i=1;i<=linenumber;i++)
		{
			System.out.print(index+ " ");
			index++;
		}
		System.out.println();
	
	}while((linenumber+index)<=value);

}
}

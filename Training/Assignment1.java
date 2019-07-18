package Training;

import java.util.Scanner;

public class Assignment1 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Value is "+Even_Odd());
		System.out.println("Day is "+Week());;
		System.out.println("Numbers from 1 to 100");
		While_Loop();
		System.out.println("\n"+"Alphabet from a to z");
		For_ASCII();
		
		
	}
	
	public static String Even_Odd()
	{
		System.out.println("Please enter the input value ");
		int input= scanner.nextInt();
	if(input%2==0)
	{
		return("Even");
	}
	else
	{
		return("Odd");
	}
	}
	public static String Week()
	{
		System.out.println("Please enter the day ");
		int input= scanner.nextInt();
		String day ="";
		switch(input)
		{
		case 1: day="Monday";break;
		case 2: day="Tuesday";break;
		case 3: day="Wednesday";break;
		case 4: day="Thursday";break;
		case 5: day="Friday";break;
		case 6: day="Saturday";break;
		case 7: day="Sunday";break;
		default: day="Wrong entry";
		
		}
		return(day);
		
	}
	
	public static void While_Loop()
	{
		int index=1;
		while (index<=100)
		{
			System.out.print(index+" ");
			index++;
		}
		
	}
	public static void For_ASCII()
	{
		
		for(int i=65;i<=90;i++)
		{
			System.out.print((char)i+" ");
		}
		
	}
	
}

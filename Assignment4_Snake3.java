package Training;

import java.util.Scanner;

public class Assignment4_Snake3 {

	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n;
		System.out.println("\t Snake Pattern");
		System.out.println("\t###############\n");

		System.out.println("Enter the Array size");
		n=scan.nextInt();
		int[][] matrix= new int[n][n];
		System.out.println("Enter the Array elements");
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the row"+ i+ " col "+ j +" ");	
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("\tInput Matrix");
		System.out.println("\t#############\n");	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print( matrix[i][j]+" ");				
			}
			System.out.println();
		}
		
		int k=0;
		
		System.out.println("\tOutput Matrix");
		System.out.println("\t#############\n");
		
		for(int i=0;i<n;i++)
		{
			if(k%2==0)
			{
			for(int j=0;j<n;j++)
			{
				System.out.print( matrix[i][j]+" ");				
			}
			}
			else
			{
				for(int j=n-1;j>=0;j--)
				{
					System.out.print( matrix[i][j]+" ");				
				}
			}
			k++;
			System.out.println();
		}
	}
}

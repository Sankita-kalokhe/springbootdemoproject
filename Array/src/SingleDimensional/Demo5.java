package SingleDimensional;

import java.util.Scanner;

public class Demo5
{
	public static void main(String [] args)
	{
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the row  size:");
		System.out.println("Enter the column  size:");
		
		int arr[ ][ ]=new int  [scan.nextInt()][scan.nextInt()];
		
		for (int i = 0; i<arr.length ; i++)
		{
			System.out.println("Enter "+(i+1)+ "st row values");
			
			for (int j= 0; i<arr[i].length; j++)
			{
				System.out.println("Enter "+ "st column values");
			
				
				arr[i][j]=scan.nextInt();
			}
		}

		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int  j=0 ; j<arr[i].length ; j++)
			{
				System.out.println(arr[i][j]+" ");
			}		

		}
		System.out.println();

	}
}
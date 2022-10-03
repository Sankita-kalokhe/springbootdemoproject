package SingleDimensional;
import java.util.Scanner;
public class Demo4
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Index Size");
		int size = scan.nextInt();
		int arr[] = new int [size];
		System.out.println("enter "+size+" element");
		for(int i =0; i<arr.length; i++)
		{
			arr[i] =scan.nextInt();
		}
		System.out.println("-----------------------------");
		System.out.println("Array element are:");
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
           System.out.println("Elements are:");
		}
	}


}

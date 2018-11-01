// url for problem defination 
// https://www.geeksforgeeks.org/minimum-increment-operations-to-make-the-array-in-increasing-order/
import java.util.Scanner;
public class IncreasingOrder {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		int i,inc = 2,steps=0;

		System.out.println("Enter "+array.length+" Elements for Array");
		for(i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		for(i=1;i<array.length;i++)
		{
			if(array[i]<=array[i-1]){
				array[i] = array[i-1]+inc;
				steps++;
			}
		}
		System.out.println("Output is ");
		for(i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println("\nNumber of Steps Required to Make it IncreasingOrder is "+steps);
	}
}


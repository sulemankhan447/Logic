import java.util.*;
public class FibboSubsequence {
	public static void main(String args[]){
		int i = 0,j=0,num=0,next=0,sub_next,final_next=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int len = sc.nextInt();
		int array[] = new int[len];
		int output[] = new int[len*3];	//for storing multiple arrays if any
		for(i=0;i<len;i++){
			array[i] = sc.nextInt();
		}
		for(i=0;i<len;i++){
			System.out.println("*****");
			num = array[i];
			next = 0;
			sub_next = 0;
			for(j=i+1;j<len;j++){
				next = num+array[j];
				// System.out.println("next is "+next);
				if(arrayContains(array,next)){
					// System.out.print("hai waha "+next);
					System.out.print(num+" "+" "+array[j]+" "+next);
					// num = array[j];
					// sub_next  = array[j]+array[j+1];
					sub_next  = array[j]+next;
					while(arrayContains(array,sub_next)){
						System.out.print(" "+sub_next);
						sub_next = next+sub_next;
					}
					System.out.println();
					break;
					// if(arrayContains(array,sub_next)){
					// 	System.out.print(" "+sub_next);
					// }
				}
					else
					{
						break;
					}

			}
		}
	}
	public static boolean arrayContains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
}
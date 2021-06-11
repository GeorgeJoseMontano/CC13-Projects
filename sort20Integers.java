import java.util.Scanner;

public class sort20Integers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input:");
      
		int[] A = new int[20];
		
		// input 20 integers
		for(int i = 0; i < 20; i++){										
			A[i] = input.nextInt();
		}
		
		input.close();
		
		int n, l, t;

		for(int i = 0; i < A.length; i++){
			n = A[i];
			l = 0;

			while(A[l] < n && l < i){
				l++;
			}
			
			t = i;
			
			while(t > l){
				A[t] = A[t - 1];
				t--;
			}
			
			A[l] = n;
		}
		
		// print the sorted array
		System.out.println("The Array is: ");
		printArray(A);	
	}
	
	// method to print the array
	public static void printArray(int Array[])
	{
		for(int r=0;r<Array.length;r++)
		{
			System.out.printf("%2d", Array[r]);
			System.out.print(" ");
		}
	}
}

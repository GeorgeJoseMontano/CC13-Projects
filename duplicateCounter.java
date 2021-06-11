import java.util.Scanner;

public class duplicateCounter {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
      	System.out.println("Input:");
    
		int[] array1 = new int[20];
		
		// input integers
		for(int i = 0; i < 20; i++){										
			array1[i] = input.nextInt();
		}
		input.close();

		// traverse array and count duplicates
		for(int a=0;a<20;a++){
			int count = 0;
			for(int b=0;b<20;b++){
				if(array1[a]==array1[b]) {
					count++;
				}
			}
			if(check(array1,a, array1[a]) && count>1) {
				System.out.println(array1[a] + " = " + count);
			}
		}
		
	}

	// method to check if integer in array has been counted already
	static boolean check(int array[], int x, int num) {
		if(x!=0) {
			for(int i=x-1;i!=0;i--){
				if(num==array[i]){
					return false;
				}
				if(num==array[0]){
					return false;
				}
			}
		}
		return true;
	}

}

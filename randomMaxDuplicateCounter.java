import java.util.Scanner;
import java.util.Random;

public class randomMaxDuplicateCounter {

	public static void main(String[] args) {
		int maxNum = 0, maxCount = 0;
		
		Scanner input= new Scanner(System.in);
      	System.out.println("Input:");
      	
      	// input number limit
      	int num = input.nextInt();
      	
      	Random rand = new Random();
      	
		int[] array1 = new int[10000];
		
		// input random numbers into the array
		for(int i = 0; i < array1.length; i++) {
			int randomNum = rand.nextInt(num);
			array1[i] = randomNum + 1;
		}
		input.close();
		
		// count duplicates
		for(int a=0;a<10000;a++) {
			int count = 0;
			for(int b=0;b<10000;b++) {
				if(array1[a]==array1[b]) {
					count++;
				}
			}
			
			if(check(array1,a, array1[a]) && count>maxCount) {
				maxNum = array1[a];
				maxCount = count;
			}
		}
		
		System.out.println("Number that occured the most is "+maxNum+" which occured "+maxCount+" times");
	}
	
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

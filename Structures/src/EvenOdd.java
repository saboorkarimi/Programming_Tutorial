import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
	
		int x= scan.nextInt();
		
		for(int count=0; count<=x ; count++){
			
			if (count%2==1){
			System.out.println(count);
			}
		}
	}
	
}

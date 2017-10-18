import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		int x = scan.nextInt();
		
		if(x >95){
			System.out.println("1.0");
		}
		else if (x<95 && x>90){
			System.out.println("1.3");
	
		}
		else if (x<90 && x>85){
			System.out.println("1.7");
		}
		
		else if (x<85 && x>80){
			System.out.println("2.2");
		}
		else if (x<80 && x>70){
			System.out.println("3");
		}
		
		else if (x<70 && x>60){
			System.out.println("3.5");
		}
		else if (x<60 && x>50){
			System.out.println("4");
		}
		
		else{
			System.out.println("Faild");
		}
		
	}
}

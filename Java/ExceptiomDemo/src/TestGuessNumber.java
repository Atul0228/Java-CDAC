import java.util.Scanner;
public class TestGuessNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Tell me the number");
		int num=sc.nextInt();
		
		while(true) {
			try{
				System.out.println("Enter the Number to check");
				
				int num1=sc.nextInt();
				
				if(num==num1) {
					System.out.println("You guessed it right , You are Awesome man");
					break;
				}
				else if(num>num1) {
					System.out.println("The number is Smaller try with bigger number");
				}
				
			else {
					System.out.println("The number is larger try with smaller number");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
			
			
		}

	}

}

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestTwoTry {
	private static int divide (int x,int y) {
		return x/y;
	} 
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter number 1 to divide");
		int num=sc.nextInt();
		System.out.println("Enter number 2 to Divide");
		int num1=sc.nextInt();
		try { 
		int sum=divide(num,num1);
		System.out.println("Sum is  :  "+sum);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("At the End of try block");
	}catch(InputMismatchException e) {
		System.out.println("please enter the number");
	}
	}

}

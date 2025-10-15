import java.util.Scanner;
import java.io.*;
public class TestException {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data to Store in File");
		String data=sc.nextLine();
		try {
			
		FileOutputStream writeData=new FileOutputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\atul.txt");
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			writeData.write(c);
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}

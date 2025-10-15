import java.util.Scanner;
import java.io.FileOutputStream;
public class TestRead {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		String data=sc.nextLine();
		try {
			FileOutputStream write=new FileOutputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\abc.txt");
			
			for(int i=0;i<data.length();i++) {
				
				char a=data.charAt(i);
				write.write(a);
			
				
				
			}
			System.out.println("DATA ADDED SUCCESSFULLY");
			
			
			
		}catch(Exception e) {
			System.out.println("");
		}
		
		// TODO Auto-generated method stub

	}

}

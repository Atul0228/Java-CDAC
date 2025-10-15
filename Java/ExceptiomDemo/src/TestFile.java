import java.io.*;
public class TestFile {
public static void main(String[] args) {
	String data="123";
	try {
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\atul.txt");
		
		fos.write(data.getBytes());
		
		fos.close();
		System.out.println("HFile is created");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		
	}
}
}

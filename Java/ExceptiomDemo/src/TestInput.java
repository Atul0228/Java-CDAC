import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInput {
    public static void main(String[] args) {
        //String data = "atul";
        try  {
        	FileInputStream fis=new FileInputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\atul.txt");
            int i=fis.read();
            while(i!=-1) {
            	 System.out.println((char) i);
            	 
            	 i=fis.read();
            }
            fis.close();
            System.out.println("Data read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

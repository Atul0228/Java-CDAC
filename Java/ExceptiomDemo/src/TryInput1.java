import java.io.FileInputStream;
import java.io.IOException;

public class TryInput1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Print each character
            }
            fis.close();
            System.out.println("\nData read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

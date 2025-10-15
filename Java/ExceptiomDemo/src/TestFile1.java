import java.io.*;

public class TestFile1 {
    public static void main(String[] args) {
        String data = "atul";
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\IET\\Desktop\\Atul\\Java\\ExceptiomDemo\\src\\abc.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

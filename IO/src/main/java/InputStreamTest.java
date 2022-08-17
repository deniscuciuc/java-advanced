import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) {
        byte[] array = new byte[26];
        try {
            InputStream object1 = new FileInputStream("input.txt");

            System.out.println("Available bytes in the file: " + object1.available());

            object1.read(array);
            System.out.println("Data read from the file: ");

            String data = new String(array);
            System.out.println(data);

            object1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file";

        try {
            OutputStream outputStream = new FileOutputStream("output.txt");

            byte[] dataBytes = data.getBytes();

            outputStream.write(dataBytes);
            System.out.println("Data is written to the file");

            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
